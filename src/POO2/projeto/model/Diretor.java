package POO2.projeto.model;

public class Diretor implements Entidade<String> {
    private String nome;

    @Override
    public String getId() {
        return nome;
    }
}
