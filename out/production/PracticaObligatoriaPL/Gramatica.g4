grammar Gramatica;

axioma : (IDENT | CONSTINT | CONSTFLOAT | CONSTLIT | COMMENT)*;     // esto solo es para probar si el lexico esta bien cambiarlo cuando necesiteis



IDENT:      [a-zA-Z$][a-zA-Z$0-9_]*;

CONSTINT:   [+-]?DEC_DIGIT+
            | '0'[+-]?OCT_DIGIT+
            | '0x'[+-]?HEX_DIGIT+;

CONSTFLOAT: [+-]?DEC_DIGIT+'.'DEC_DIGIT+
            | '0'[+-]?OCT_DIGIT+'.'OCT_DIGIT+
            | '0x'[+-]?HEX_DIGIT+'.'HEX_DIGIT+;

CONSTLIT:   '\'' (~'\'' | '\\' '\'')* '\'';  // cualquier cosa que no sea una comilla  OR  \'

COMMENT:   '//' ~[\r\n]* ('\r'? '\n')?
            | '/*' .*? '*/';


fragment
DEC_DIGIT:  [0-9];
fragment
OCT_DIGIT:  [0-7];
fragment
HEX_DIGIT:  [0-9A-F];
