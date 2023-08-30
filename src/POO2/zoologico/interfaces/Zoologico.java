package POO2.zoologico.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Golfinho golfinho = new Golfinho();
        Nadador ornitorrinco = new Ornitorrinco();
        Nadador tartaruga = new Tartaruga();

        List<Nadador> nadadores = List.of(golfinho, ornitorrinco, tartaruga);
        adicionarGolfinhos(nadadores);
        colocarParaNadar(nadadores);

        List<Golfinho> golfinhos = new ArrayList<>();
        adicionarGolfinhos(golfinhos);
        colocarParaNadar(golfinhos);

        List<Animal> animais = new ArrayList<>();
        animais.add(vaca);
        adicionarGolfinhos(animais);
        System.out.println(animais);

        List<BotoCorDeRosa> botos = new ArrayList<>();
        botos.add(new BotoCorDeRosa());
        //adicionarGolfinhos(botos); //não é possível pois ele é filho e o método só aceita classes pai
    }

    /**
     * ? extends Nadador -> qualquer classe que estenda/implemente Nadador
     *
     */
    private static void colocarParaNadar(List<? extends Nadador> nadadores) {
        for(Nadador nadador : nadadores) {
            nadador.nadar();
        }
    }

    /**
     * ? super Golfinho -> qualquer classe/interface que seja estendida/implementada por Golfinho
     *
     */
    private static void adicionarGolfinhos(List<? super Golfinho> golfinhos) {
        golfinhos.add(new Golfinho());
        System.out.println("Novo golfinho adicionado na lista.");
    }
}
