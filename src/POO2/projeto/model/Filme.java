package POO2.projeto.model;

import java.util.List;

public class Filme implements Entidade<Integer> {
    private Integer id;
    private String nome;
    private String categoria;
    private List<Diretor> diretores;
    private List<Ator> atores;

    @Override
    public Integer getId() {
        return id;
    }
}
