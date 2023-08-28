package POO2.zoologico.interfaces;

public interface Animal {
    String TESTE = "";

    default void alimentar() {
        System.out.println("Alimentando");
    }

    void movimentar();
}
