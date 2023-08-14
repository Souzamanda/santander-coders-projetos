package POO1.ex1;

/**
 * Construa o código Java para definir um objeto do tipo pessoa que possui
 * as seguintes características (nome,idade,altura,peso).
 */

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  nome + " tem " + idade + " anos, " +
                altura + " m de altura e " + peso + " kg.";
    }
}
