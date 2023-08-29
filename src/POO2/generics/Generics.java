package POO2.generics;

public class Generics {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String maiorAlfabeticamente = (String) maior(a, b);
        System.out.printf("Maior entre %s e %s: %s%n", a, b, maiorAlfabeticamente);

        Integer cinco = 5;
        Integer tres = 3;
        Integer maiorNumericamente = (Integer) maior(cinco, tres);
        System.out.printf("Maior entre %s e %s: %s%n", cinco, tres, maiorNumericamente);
    }

    private static Comparable maior (Comparable primeira, Comparable segunda) {
        return primeira.compareTo(segunda) > 0 ? primeira : segunda;
    }
}
