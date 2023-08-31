package POO2.sorteador;

import java.util.List;

public class Grupo {
    private final List<String> elementosDoGrupo;
    private final int indice;

    public Grupo(List<String> elementosDoGrupo, int indice) {
        this.elementosDoGrupo = elementosDoGrupo;
        this.indice = indice;
    }


    public void adicionarNoGrupo (String novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                ": " + elementosDoGrupo;
    }
}
