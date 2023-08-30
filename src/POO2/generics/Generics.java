package POO2.generics;

import POO2.zoologico.interfaces.Golfinho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String maiorAlfabeticamente = maior(a, b);
        System.out.printf("Maior entre %s e %s: %s%n", a, b, maiorAlfabeticamente);

        Integer cinco = 5;
        Integer tres = 3;
        Integer maiorNumericamente = maior(cinco, tres);
        System.out.printf("Maior entre %s e %s: %s%n", cinco, tres, maiorNumericamente);

        List<Object> listaObjetos = new ArrayList<>();
        listaObjetos.add("Texto");
        listaObjetos.add(1);
        listaObjetos.add(new Golfinho());

        Object numero1 = listaObjetos.get(1);

        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Texto");
        listaDeStrings.add("Lorem Ipsum");

        String str = listaDeStrings.get(0);

        Map<String, Integer> map = new HashMap<>();
        map.put("UM", 1);
        map.put("VINTE", 20);
        Integer vinte = map.get("VINTE");
        System.out.println(20);
    }

    private static <T extends Comparable<T>> T maior (T primeira, T segunda) {
        return primeira.compareTo(segunda) > 0 ? primeira : segunda;
    }
}
