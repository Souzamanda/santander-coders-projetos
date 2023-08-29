package POO2.zoologico.interfaces;

public class Golfinho implements Nadador, Amamentador{
    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho faz um salto e dispara nadando");;
    }
}
