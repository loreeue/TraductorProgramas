package Traduccion;

public class For extends Instruccion{
    private String nombreVariable;
    private String condicion;
    private Bloque bloque;
    private String cambioValor;
    private String valorInicial;

    public For(String nombreVariable, String condicion, Bloque bloque, String cambioValor, String valorInicial) {
        this.nombreVariable = nombreVariable;
        this.condicion = condicion;
        this.bloque = bloque;
        this.cambioValor = cambioValor;
        this.valorInicial = valorInicial;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public String getCondicion() {
        return condicion;
    }

    public Bloque getBloque() {
        return bloque;
    }

    public String getCambioValor() {
        return cambioValor;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        String[] cond = this.getCondicion().split("==|<|>|>=|<=");
        if (this.getCambioValor().equals(this.getNombreVariable()+" + 1")) { //incremento
            builder.append("for ").append(this.getNombreVariable()).append(" := ").append(this.getValorInicial()).append(" to").append(cond[1]).append(" do ").append("\n");
            builder.append(this.getBloque());
            return builder.toString();
        }
        else if (this.getCambioValor().equals(this.getNombreVariable()+" - 1")) { //decremento
            builder.append("for ").append(this.getNombreVariable()).append(" := ").append(this.getValorInicial()).append(" downto").append(cond[1]).append(" do ").append("\n");
            builder.append(this.getBloque());
            return builder.toString();
        }
        else { //transformar en un while
            Asignacion asig = new Asignacion(this.getNombreVariable(), this.getCambioValor());
            this.getBloque().getInstrucciones().add(asig);
            While myWhile = new While(this.getCondicion(), this.getBloque());
            return myWhile.toString();
        }
    }
}