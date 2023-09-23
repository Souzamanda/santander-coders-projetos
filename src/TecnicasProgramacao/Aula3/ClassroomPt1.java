package TecnicasProgramacao.Aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClassroomPt1 {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Cachorro", true, false));
        animais.add(new Animal("Peixe", false, false));
        animais.add(new Animal("Pato", true, true));

        /*
         * Recebe um objeto e retorna um boolean
         *
         * Predicate<T> = boolean test(T)
         */
        Predicate<Animal> testarAndador = animal -> animal.podeAndar();
        Predicate<Animal> testarVoador = animal -> animal.podeVoar();

        System.out.println("Estes andam: \n");
        imprime(animais, testarAndador);

        System.out.println("\n");

        System.out.println("Estes voam: \n");
        imprime(animais, testarVoador);
    }

    /*private static void imprimeOsQueAndam(List<Animal> animais) {
        for (Animal animal : animais) {
            if (animal.podeAndar()) {
                System.out.println(animal.getEspecie());
            }
        }
    }

    private static void imprimeOsQueVoam(List<Animal> animais) {
        for (Animal animal : animais) {
            if (animal.podeVoar()) {
                System.out.println(animal.getEspecie());
            }
        }
    }*/

    private static void imprime(List<Animal> animais, Predicate<Animal> validador) {
        for (Animal animal : animais) {
            if (validador.test(animal)) {
                System.out.println(animal.getEspecie());
            }
        }
    }
}
