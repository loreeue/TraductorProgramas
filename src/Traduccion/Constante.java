package Traduccion;

public class Constante {
    private String tipo;
    private String valor;

    public Constante(String tipo, String valor) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getTipo() + " = " + this.getValor() + ";";
    }
}