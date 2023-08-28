package POO2.zoologico.interfaces;

public class Ornitorrinco implements Nadador, Amamentador{

    @Override
    public void movimentar() {
        nadar();
    }
}
