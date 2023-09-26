package TecnicasProgramacao.Exercicios;

import java.util.function.BiFunction;

/**
 * Crie uma aplicação que simule uma calculadora utilizando lambda e a interface funcional BiFunction.
 * Para isso crie uma classe Calculadora com um método chamado executar(int x, int y, BiFuncition) que recebe dois números inteiros positivos
 * e uma BiFunction como parâmetros.
 * Desenvolva a implementação em lambda para cada operação, ou seja: somar, subtrair, multiplicar e dividir (resultado inteiro).
 * Chama a função executar() para cada uma das operações.
 * O método executar() executar imprimir na tela (System.out.println()) o resultado final das operações que realizar.
 */
public class InterfacesFuncionais {
    public static void main(String[] args) {

        // lambda para soma
        executar(2, 5, (x,y) -> x + y);

        // lambda para subtracao
        executar(2, 5, (x,y) -> x - y);

        // lambda para multiplicacao
        executar(2, 5, (x,y) -> x * y);

        // lambda para divisao
        executar(2, 0, (x,y) -> {
            if (y != 0) {
                return x.doubleValue() / y.doubleValue();
            } else {
                return "Erro: Divisor não pode ser 0.";
            }
        });
    }

    public static <T> void executar(int x, int y, BiFunction<Integer, Integer, T> biFunction) {
        System.out.println(biFunction.apply(x, y));
    }
}
