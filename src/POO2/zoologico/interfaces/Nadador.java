package POO2.zoologico.interfaces;

public interface Nadador extends Animal {
    default void nadar() {
        System.out.println("Nadando");
    }
}
