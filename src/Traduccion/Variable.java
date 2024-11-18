package Traduccion;

public class Variable {
    private String nombre;
    private String tipo;

    public Variable(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        if (!"void".equals(this.getTipo())) {
            return this.getNombre() + ": " + this.getTipo();
        } else {
            return "";
        }
    }
}