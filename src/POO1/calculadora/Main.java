package POO1.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(2.5, 2);
        System.out.println(calc.somar());
        System.out.println(calc.subtrair());
        System.out.println(calc.dividir());
        System.out.println(calc.multiplicar());
    }
}
