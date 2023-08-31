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
        Sorteador sorteador = new Sorteador(elementos);

        /*while(!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }*/

        System.out.println(sorteador.agrupar(2));
    }
}
