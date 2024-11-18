package Traduccion;

import java.util.List;

public class ProgramaGlobal {
    private String nombreArchivo;
    private List<Constante> constantes;
    private List<Subprograma> subprogramas;
    private Bloque bloqueMain;

    public ProgramaGlobal(String nombreArchivo, List<Constante> defConstantes, List<Subprograma> subprogramas, Bloque bloqueMain) {
        this.nombreArchivo = nombreArchivo;
        this.constantes = defConstantes;
        this.subprogramas = subprogramas;
        this.bloqueMain = bloqueMain;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public List<Constante> getConstantes() {
        return constantes;
    }

    public List<Subprograma> getSubprogramas() {
        return subprogramas;
    }

    public Bloque getBloqueMain() {
        return bloqueMain;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (this.getBloqueMain() == null) {
            builder.append("unit ").append(this.getNombreArchivo()).append(";").append("\n").append("\n");
        } else {
            builder.append("program ").append(this.getNombreArchivo()).append(";").append("\n").append("\n");
        }
        if (this.getConstantes() != null && !this.getConstantes().isEmpty()) {
            builder.append("const\n");
            for (Constante cte : getConstantes()) {
                builder.append("\t").append(cte.toString()).append("\n");
            }
        }
        builder.append("\n");
        if (this.getSubprogramas() != null && !this.getSubprogramas().isEmpty()) {
            for (Subprograma sub : this.getSubprogramas()) {
                if (sub != null) {
                    builder.append(sub).append("\n");
                }
            }
        }
        builder.append(this.getBloqueMain()).append(".");
        return builder.toString();
    }
}