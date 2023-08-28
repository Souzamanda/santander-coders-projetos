package POO1.cadastroFilmes;

import java.util.ArrayList;

public class IMDB {
    private ArrayList<Ator> atores = new ArrayList<>();
    private ArrayList<Diretor> diretores = new ArrayList<>();
    private ArrayList<Filme> filmes = new ArrayList<>();

    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }

    public void adicionarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void exibirTodosAtores() {
        for(Ator ator : atores) {
            System.out.println(" ");
            System.out.println(ator);
        }
    }

    public void exibirTodosDiretores() {
        for(Diretor diretor : diretores) {
            System.out.println(" ");
            System.out.println(diretor);
        }
    }

    public void exibirTodosFilmes() {
        for(Filme filme : filmes) {
            System.out.println(" ");
            System.out.println(filme);
        }
    }

    public Ator buscarAtorPorNome(String nome) {
        for (Ator ator : atores) {
            if(ator.getNome().equalsIgnoreCase(nome)) {
                return ator;
            }
        }
        return null;
    }

    public Diretor buscarDiretorPorNome (String nome) {
        for (Diretor diretor : diretores) {
            if(diretor.getNome().equalsIgnoreCase(nome)) {
                return diretor;
            }
        }
        return null;
    }

    public Filme buscarFilmePorNome (String nome) {
        for (Filme filme : filmes) {
            if(filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void adicionarDiretorEmFilme (String nomeFilme, String nomeDiretor) {
        Filme filmeEncontrado = buscarFilmePorNome(nomeFilme);
        Diretor diretorEncontrado = buscarDiretorPorNome(nomeDiretor);

        if (filmeEncontrado == null) {
            System.out.println("Filme não existe. Tente novamente!");
        } else if(diretorEncontrado == null) {
            System.out.println("Diretor não cadastrado. Cadastre o diretor antes de atualizar o filme!");
        } else {
            filmeEncontrado.setDiretor(diretorEncontrado);
        }
    }

    public void adicionarAtoresEmFilme (String nomeFilme, String nomeAtor) {
        Filme filmeEncontrado = buscarFilmePorNome(nomeFilme);
        Ator atorEncontrado = buscarAtorPorNome(nomeAtor);

        if (filmeEncontrado == null) {
            System.out.println("Filme não existe. Tente novamente!");
        } else if(atorEncontrado == null) {
            System.out.println("Ator não cadastrado. Cadastre o ator antes de atualizar o filme!");
        } else {
            filmeEncontrado.setAtores(atorEncontrado);
        }
    }
}
