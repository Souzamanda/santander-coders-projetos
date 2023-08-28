package POO2.zoologico.interfaces;

public class Pardal implements Voador, Animal {
    @Override
    public void voar() {
        System.out.println("Voando baixo");
    }

    @Override
    public void movimentar() {
        voar();
    }
}
