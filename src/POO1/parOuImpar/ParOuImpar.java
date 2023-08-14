package POO1.parOuImpar;

import java.util.Scanner;

/**
 * Faça um programa que receba um número como entrada e informe ao usuário se
 * o número é impar ou par.
 * Para determinar se o número é impar ou par, você deve criar uma classe
 * que represente este cálculo.
 */

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = sc.nextInt();

        System.out.println(parOuImpar(valor));
    }
    public static String parOuImpar(int valor) {
        if (valor % 2 == 0) {
            return "O número " + valor + " é PAR!";
        } else {
            return "O número " + valor + " é ÍMPAR!";
        }
    }
}
