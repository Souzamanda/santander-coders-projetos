package POO2.projeto.model;

public class Ator implements Entidade<String> {
    private String cpf;
    private String nome;

    @Override
    public String getId() {
        return cpf;
    }
}
