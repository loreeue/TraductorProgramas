package Traduccion;

public class Declaracion extends Instruccion{
    private String tipo;
    private String nombre;

    public Declaracion(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        String out = this.getNombre() + " : ";
        if ("INTEGER".equals(this.getTipo()) || "REAL".equals(this.getTipo())) {
            out += this.getTipo();
        }
        out += ";";
        return out;
    }
}