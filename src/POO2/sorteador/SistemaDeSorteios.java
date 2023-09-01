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
        Sorteador<String> sorteadorString = new Sorteador<>(elementos);

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
        Sorteador<Integer> sorteadorInt = new Sorteador<>(elementosInt);

        System.out.println(sorteadorString.agrupar(3));
        System.out.println(sorteadorInt.agrupar(3));
    }
}
