package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {
    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        Random randomInt = new Random();
        int numeroSorteado = randomInt.nextInt(elementos.size());
        String elementoSorteado = elementos.get(numeroSorteado);
        elementos.remove(numeroSorteado);
        return elementoSorteado;
    }

    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maça");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador sorteador = new Sorteador(elementos);

        while(!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }
    }
}
