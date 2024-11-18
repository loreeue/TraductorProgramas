package Traduccion;

public class IfElse extends Instruccion{
    private String condicion;
    private Bloque bloqueIf;
    private Bloque bloqueElse;

    public IfElse(String condicion, Bloque bloqueIf, Bloque bloqueElse) {
        this.condicion = condicion;
        this.bloqueIf = bloqueIf;
        this.bloqueElse = bloqueElse;
    }

    public String getCondicion() {
        return condicion;
    }

    public Bloque getBloqueIf() {
        return bloqueIf;
    }

    public Bloque getBloqueElse() {
        return bloqueElse;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String tab = "";
        for (int i = 0; i < this.getBloqueIf().getIdentacion()-1; i++) {
            tab += "\t";
        }

        builder.append("if ").append(this.getCondicion()).append(" then\n");
        builder.append(this.getBloqueIf()).append("\n");
        builder.append(tab).append("else\n");
        builder.append(this.getBloqueElse());
        return builder.toString();
    }
}