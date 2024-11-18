package Traduccion;

public class Llamada extends Instruccion{

    private String nombre;
    private String valor;

    public Llamada(String nombre, String valor) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return this.getNombre() + this.getValor();
    }
}