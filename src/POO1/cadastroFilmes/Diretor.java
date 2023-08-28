package POO1.cadastroFilmes;

public class Diretor extends Pessoa{
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    public Diretor() {
    }

    public Diretor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String toString() {
        return nome + ", " + idade + " anos.";
    }
}
