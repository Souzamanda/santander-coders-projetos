package POO2.sorteador;

import java.util.List;

public class SorteadorUltimo<T> extends SorteadorAbstrato<T> {

    public SorteadorUltimo(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() - 1;
    }
}
