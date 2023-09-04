package POO2.sorteador;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SorteadorAleatorio<T> extends SorteadorAbstrato<T> {

    public SorteadorAleatorio(List<T> elementos) {
        super(elementos);
    }


    @Override
    protected int getIndiceSorteado() {
        return ThreadLocalRandom.current().nextInt(0, quantidadeElementos());
    }
}
