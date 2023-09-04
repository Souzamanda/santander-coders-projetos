package POO2.sorteador;

import java.util.List;
import java.util.Random;

public abstract class SorteadorAbstrato<T> implements Sorteador<T> {
    private final List<T> elementos;

    public SorteadorAbstrato(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if(elementos.isEmpty()) {
            return null;
        }

        int numeroSorteado = getIndiceSorteado();
        return elementos.remove(numeroSorteado);
    }

    protected abstract int getIndiceSorteado();

    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    protected int quantidadeElementos() {
        return elementos.size();
    }
}
