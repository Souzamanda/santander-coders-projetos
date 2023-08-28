package POO2.zoologico.interfaces;

public class Golfinho implements Nadador, Amamentador {
    @Override
    public void movimentar() {
        nadar();
    }
}
