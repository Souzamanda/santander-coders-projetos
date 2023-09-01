package POO2.sorteador;

import java.util.List;

public class Grupo<T> {
    private final List<T> elementosDoGrupo;
    private final int indice;

    public Grupo(List<T> elementosDoGrupo, int indice) {
        this.elementosDoGrupo = elementosDoGrupo;
        this.indice = indice;
    }


    public void adicionarNoGrupo (T novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                ": " + elementosDoGrupo;
    }
}
