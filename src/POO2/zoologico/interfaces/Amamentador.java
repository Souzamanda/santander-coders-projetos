package POO2.zoologico.interfaces;

public interface Amamentador extends Animal {
    default void amamentar() {
        System.out.println("Amamentando");
    }
}
