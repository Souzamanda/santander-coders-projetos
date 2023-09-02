package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {
    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maça");
        elementos.add("abacate");
        elementos.add("tomate");
        elementos.add("melancia");
        elementos.add("melao");
        elementos.add("carambola");
        elementos.add("jaca");
        Agrupador<String> agrupadorString = new Agrupador<>(elementos);

        /*while(!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }*/

        List<Integer> elementosInt = new ArrayList<>();
        elementosInt.add(1);
        elementosInt.add(12);
        elementosInt.add(5);
        elementosInt.add(-8);
        elementosInt.add(63);
        elementosInt.add(853);
        elementosInt.add(7);
        elementosInt.add(6);
        Agrupador<Integer> agrupadorInt = new Agrupador<>(elementosInt);

        System.out.println(agrupadorString.agrupar(3));
        System.out.println(agrupadorInt.agrupar(3));
    }
}
