package POO1.parOuImpar;

/**
 * Faça um programa que receba um número como entrada e informe ao usuário se
 * o número é impar ou par.
 * Para determinar se o número é impar ou par, você deve criar uma classe
 * que represente este cálculo.
 */

public class ParOuImpar {
    public static void main(String[] args) {
        System.out.println(parOuImpar(2));
        System.out.println(parOuImpar(7));

    }
    public static String parOuImpar(int valor) {
        if (valor % 2 == 0) {
            return "O número " + valor + " é PAR!";
        } else {
            return "O número " + valor + " é ÍMPAR!";
        }
    }
}
