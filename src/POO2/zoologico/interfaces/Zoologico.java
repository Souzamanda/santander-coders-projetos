package POO2.zoologico.interfaces;

import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Golfinho golfinho = new Golfinho();
        Nadador ornitorrinco = new Ornitorrinco();
        Nadador tartaruga = new Tartaruga();

        List<Nadador> nadadores = List.of(golfinho, ornitorrinco, tartaruga);
        colocarParaNadar(nadadores);
    }

    private static void colocarParaNadar(List<Nadador> nadadores) {
        for(Nadador nadador : nadadores) {
            nadador.nadar();
        }
    }
}
