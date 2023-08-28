package POO2.zoologico.interfaces;

public interface Animal {
    default void alimentar() {
        System.out.println("Alimentando");
    }

    void movimentar();
}
