package POO2.zoologico.interfaces;

public interface Voador {
    default void voar() {
        System.out.println("Voando!");
    }
}
