package POO2.projeto.model;

public class Ator implements Entidade<String> {
    private final String cpf;
    private final String nome;

    public Ator(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
