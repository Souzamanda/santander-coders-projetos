package POO2.projeto.model;

public class Diretor implements Entidade<Integer> {
    private final Integer id;
    private final String nome;

    public Diretor(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
