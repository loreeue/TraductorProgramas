package Traduccion;

public class Return extends Instruccion{
    private String nombreFuncion;
    private String loQueSeDevuelve;

    public Return(String nombreFuncion, String loQueSeDevuelve) {
        this.nombreFuncion = nombreFuncion;
        this.loQueSeDevuelve = loQueSeDevuelve;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public String getLoQueSeDevuelve() {
        return loQueSeDevuelve;
    }

    @Override
    public String toString() {
        return this.getNombreFuncion() + " := " + this.getLoQueSeDevuelve() + ";";
    }
}