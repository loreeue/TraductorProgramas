grammar Gramatica;
@header {
    import Traduccion.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.io.PrintWriter;
}

@members {
    private String fileName;
    private PrintWriter printWriter;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }
    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }
}

axioma : program {
    ProgramaGlobal prog = new ProgramaGlobal(getFileName(), $program.constantes, $program.subprogramas, $program.bloqueMain);
    printWriter.println(prog);
};

program returns [List<Constante> constantes, Bloque bloqueMain, List<Subprograma> subprogramas]: defines part partes {
    if ($part.bloqueMain != null) {
        $partes.bloqueMain = $part.bloqueMain;
    }
    $partes.listaSubps.add(0, $part.subprograma);
    $constantes = $defines.listaCtes;
    $bloqueMain = $partes.bloqueMain;
    $subprogramas = $partes.listaSubps;
};

defines returns [List<Constante> listaCtes]: '#define' IDENT ctes sig=defines {
    Constante cte = new Constante($IDENT.text, $ctes.text);
    $sig.listaCtes.add(0, cte);
    $listaCtes = $sig.listaCtes;
}| {$listaCtes = new ArrayList();};

ctes : CONSTINT | CONSTFLOAT | CONSTLIT;

partes returns [Bloque bloqueMain, List<Subprograma> listaSubps]: {
    $listaSubps = new ArrayList();
} part sig=partes {
    if ($part.bloqueMain != null) {
        $bloqueMain = $part.bloqueMain;
    }
    if ($partes.bloqueMain != null) {
        $bloqueMain = $partes.bloqueMain;
    }
    $sig.listaSubps.add(0, $part.subprograma);
    $listaSubps = $sig.listaSubps;
}| {$listaSubps = new ArrayList();};

part returns [Bloque bloqueMain, Subprograma subprograma]: type IDENT restpart[$IDENT.text] {
    if ("main".equals($IDENT.text)) {
        $bloqueMain = $restpart.bloque;
    }
    else {
        Cabecera cab = new Cabecera($type.val, $IDENT.text, $restpart.listaParametros);
        Bloque bloque = $restpart.bloque;
        $subprograma = new Subprograma(cab, bloque);
    }
};

//parte opcional
lcond1 returns [String val]: cond lcond2 {$val = $cond.val + $lcond2.val;}
| '!' cond lcond2{$val = "!" + $cond.val + $lcond2.val;};
lcond2 returns [String val]: opl lcond1 {$val = $opl.val + $lcond1.val;}| {$val = "";};
opl returns [String val]: '||' {$val = " || ";}| '&&' {$val = " && ";};
cond returns [String val]: e1=exp1 opr e2=exp1 {$val = $e1.exp + $opr.val + $e2.exp;};
opr returns [String val]: '==' {$val = " == ";}| '<' {$val = " < ";}| '>' {$val = " > ";}| '>=' {$val = " >= ";}| '<=' {$val = " <= ";};
//--------------

restpart[String nombre_subprograma] returns [List<Variable> listaParametros, Bloque bloque] : '(' params ')' blq[$nombre_subprograma, 1] {
    $listaParametros = $params.listaParametros;
    $bloque = $blq.bloque;
};

params returns [List<Variable> listaParametros] : listparam1 {$listaParametros = $listparam1.listaParametros;}
| 'void'{$listaParametros = new ArrayList();};

listparam1 returns [List<Variable> listaParametros] : type IDENT sig=listparam2{
    Variable var = new Variable($IDENT.text, $type.val);
    $sig.listaParametros.add(0, var);
    $listaParametros = $sig.listaParametros;
};

listparam2 returns [List<Variable> listaParametros] : ',' type IDENT sig=listparam2{
    Variable var = new Variable($IDENT.text, $type.val);
    $sig.listaParametros.add(0, var);
    $listaParametros = $sig.listaParametros;
}| {$listaParametros = new ArrayList();};

blq[String nombre_subprograma, int identacion] returns [Bloque bloque]:
    '{' sent1[nombre_subprograma, $identacion]{
        List<Declaracion> listaDeclaraciones = new ArrayList();
        List<Instruccion> listaInstrucciones = new ArrayList();

        if($sent1.decl != null)
            listaDeclaraciones.add(0, $sent1.decl);
        if($sent1.inst != null)
            listaInstrucciones.add(0, $sent1.inst);
    }
    sentlist[$nombre_subprograma, listaDeclaraciones, listaInstrucciones, $identacion] '}'{
        $bloque = new Bloque($sentlist.listaDeclaracionesS, $sentlist.listaInstruccionesS, $identacion);
    };
type returns [String val]: 'void' {$val = "void";}| 'int' {$val = "INTEGER";}| 'float' {$val = "REAL";};

sentlist[String nombre_subprograma, List<Declaracion> listaDeclaracionesH, List<Instruccion> listaInstruccionesH, int identacion] returns [List<Declaracion> listaDeclaracionesS, List<Instruccion> listaInstruccionesS]:
    sent1[$nombre_subprograma, $identacion]{
        if($sent1.decl != null)
            $listaDeclaracionesH.add($sent1.decl);
        if($sent1.inst != null)
            $listaInstruccionesH.add($sent1.inst);
    }
    sub_sentlist=sentlist[$nombre_subprograma, $listaDeclaracionesH, $listaInstruccionesH, $identacion]{
        $listaDeclaracionesS = $sub_sentlist.listaDeclaracionesS;
        $listaInstruccionesS = $sub_sentlist.listaInstruccionesS;
    }| {
        $listaDeclaracionesS = $listaDeclaracionesH;
        $listaInstruccionesS = $listaInstruccionesH;
    };

sent1[String nombre_subprograma, int identacion] returns [Declaracion decl, Instruccion inst]: type lid1 ';' {
    $decl = new Declaracion($type.val, $lid1.val);
}| ident1 {
    $inst = $ident1.inst;
}| 'return' exp1 ';' {
    $inst = new Return($nombre_subprograma, $exp1.exp);
}
| 'if' '(' lcond1 ')' blqIf=blq[$nombre_subprograma, $identacion + 1] 'else' blqElse=blq[$nombre_subprograma, $identacion + 1] {$inst = new IfElse($lcond1.val, $blqIf.bloque, $blqElse.bloque);}
| 'while' '(' lcond1 ')' blq[$nombre_subprograma, $identacion + 1] {$inst = new While($lcond1.val, $blq.bloque);}
| 'do' blq[$nombre_subprograma, $identacion + 1] 'until' '(' lcond1 ')' {$inst = new RepeatUntil($blq.bloque, $lcond1.val);}
| 'for' '(' sig1=IDENT '=' sig3=exp1 ';' lcond1 ';' sig2=IDENT '=' sig4=exp1 ')' blq[$nombre_subprograma, $identacion + 1] {
    $inst = new For($sig1.text, $lcond1.val, $blq.bloque, $sig4.exp, $sig3.exp);
};
ident1 returns [Instruccion inst]: IDENT ident2 {
    $inst = null;
    if ($ident2.esAsignacion) {
        $inst = new Asignacion($IDENT.text, $ident2.val);
    } else if ($ident2.esLlamada) {
        $inst = new Llamada($IDENT.text, $ident2.val);
    }
};
ident2 returns [String val, boolean esAsignacion, boolean esLlamada]: '=' exp1 ';' {$val = $exp1.exp;
    $esAsignacion = true;}
| '(' lexp1 ')' ';' {$val = "(" + $lexp1.val + ");";
    $esLlamada = true;}; // llamada a otra función

lid1 returns [String val]: IDENT lid2 {$val = $IDENT.text + $lid2.val;};
lid2 returns [String val]: ',' IDENT lid2 {$val = ", " + $IDENT.text + $lid2.val;}| {$val = "";};
lexp1 returns [String val]: exp1 lexp2 {$val = $exp1.exp + $lexp2.val;}| {$val = "";};
lexp2 returns [String val]: ',' exp1 lexp2 {$val = "," + $exp1.exp + $lexp2.val;}| {$val = "";};
exp1 returns [String exp]: factor1 exp2{$exp = $factor1.val + $exp2.exp;};
exp2 returns [String exp]: op exp1{$exp = $op.val + $exp1.exp;}| {$exp = "";};
op returns [String val]: '+'{$val = " + ";} | '-' {$val = " - ";}| '*' {$val = " * ";}| '/' {$val = " div ";}| '%'{$val = " mod ";};
factor1 returns [String val]: IDENT factor2 {$val = $IDENT.text + $factor2.val;}| '(' exp1 ')'{$val = "(" + $exp1.exp+")";}| ctes {$val = $ctes.text;};
factor2 returns [String val]: '(' lexp1 ')' {$val = "(" + $lexp1.val + ")";}| {$val = "";};

IDENT:      [a-zA-Z$][a-zA-Z$0-9_]*;

CONSTINT:   [+-]?DEC_DIGIT+
            | '0'[+-]?OCT_DIGIT+
            | '0x'[+-]?HEX_DIGIT+;

CONSTFLOAT: [+-]?DEC_DIGIT+'.'DEC_DIGIT+
            | '0'[+-]?OCT_DIGIT+'.'OCT_DIGIT+
            | '0x'[+-]?HEX_DIGIT+'.'HEX_DIGIT+;

CONSTLIT:   '\'' (~'\'' | '\\' '\'')* '\'';  // cualquier cosa que no sea una comilla  OR  \'

COMMENT:   ('//' ~[\r\n]* ('\r'? '\n')?
            | '/*' .*? '*/') -> skip;

fragment
DEC_DIGIT:  [0-9];
fragment
OCT_DIGIT:  [0-7];
fragment
HEX_DIGIT:  [0-9A-F];

WS : [\n\r\t ]  -> skip;