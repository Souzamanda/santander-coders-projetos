package POO2.zoologico.interfaces;

public class Ornitorrinco implements Amamentador, Nadador{
    @Override
    public void movimentar() {
        nadar();
    }
}
