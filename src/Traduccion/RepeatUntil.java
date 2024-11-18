package Traduccion;

public class RepeatUntil extends Instruccion{
    private Bloque bloque;
    private String condicion;

    public RepeatUntil(Bloque bloque, String condicion) {
        this.bloque = bloque;
        this.condicion = condicion;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public String getCondicion() {
        return condicion;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String tab = "";
        for (int i = 0; i < this.getBloque().getIdentacion()-1; i++) {
            tab += "\t";
        }

        builder.append("repeat\n");
        builder.append(this.getBloque()).append("\n");
        builder.append(tab).append("until ").append(this.getCondicion()).append(";");
        return builder.toString();
    }
}