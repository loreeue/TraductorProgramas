package Traduccion;

public class Subprograma {
    private Cabecera cabecera;
    private Bloque bloque;

    public Subprograma(Cabecera cabecera, Bloque bloque) {
        this.cabecera = cabecera;
        this.bloque = bloque;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public Cabecera getCabecera(){
        return cabecera;
    }

    @Override
    public String toString() {
        return this.getCabecera() + "\n" + this.getBloque() + ";\n";
    }
}