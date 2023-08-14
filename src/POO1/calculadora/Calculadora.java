package POO1.calculadora;

/**
 * Descreva o código Java para definir um objeto do tipo “Calculadora”
 * que tem como características um valor1 e um valor2 e possui os
 * comportamentos de somar, subtrair, multiplicar e dividir.
 * <p>
 * Cada comportamento deve retornar o valor da operação correspondente.
 */

public class Calculadora {
    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public Calculadora() {
    }

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double somar () {
        return this.valor1 + this.valor2;
    }

    public double subtrair () {
        return this.valor1 - this.valor2;
    }

    public double dividir () {
        return this.valor1 / this.valor2;
    }

    public double multiplicar () {
        return this.valor1 * this.valor2;
    }
}
