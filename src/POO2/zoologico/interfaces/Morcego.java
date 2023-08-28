package POO2.zoologico.interfaces;

public class Morcego implements Voador, Amamentador{

    @Override
    public void movimentar() {
        voar();
    }
}
