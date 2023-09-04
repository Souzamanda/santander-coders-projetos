package POO2.sorteador;

import java.util.List;

public class SorteadorMeio<T> extends SorteadorAbstrato<T> {

    public SorteadorMeio(List<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() / 2;
    }
}
