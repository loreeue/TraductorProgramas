package Traduccion;

public class While extends Instruccion{
    private String condicion;
    private Bloque bloque;

    public While(String condicion, Bloque bloque) {
        this.condicion = condicion;
        this.bloque = bloque;
    }

    public String getCondicion() {
        return condicion;
    }

    public Bloque getBloque() {
        return bloque;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("while ").append(this.getCondicion()).append(" then\n");
        builder.append(this.getBloque());
        return builder.toString();
    }
}