package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface Sorteador<T> {

    T sortear();

    boolean possuiElementos();
}
