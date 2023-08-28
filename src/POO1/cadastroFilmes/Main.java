package POO1.cadastroFilmes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        IMDB imdb = new IMDB();

        while(true) {
            System.out.println("\n----------------------------------");
            System.out.println("1 - Cadastrar Ator");
            System.out.println("2 - Exibir todos os atores");
            System.out.println("3 - Cadastrar Diretor");
            System.out.println("4 - Exibir todos os diretores");
            System.out.println("5 - Cadastrar Filme");
            System.out.println("6 - Adicionar diretor em um filme");
            System.out.println("7 - Adicionar atores em um filme");
            System.out.println("8 - Exibir todos os filmes");
            System.out.println("9 - Pesquisar filme por nome");
            System.out.println("10 - Sair");
            System.out.println("----------------------------------\n");

            System.out.println("Digite o numero da opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Ator ---");

                    System.out.println("Digite o nome do ator: ");
                    String nomeAtor = sc.nextLine();
                    System.out.println("Digite a idade do ator: ");
                    int idadeAtor = sc.nextInt();

                    Ator ator = new Ator(nomeAtor, idadeAtor);

                    imdb.adicionarAtor(ator);
                    System.out.println("Ator cadastrado!");

                    break;
                case 2:
                    System.out.println("\n--- Lista de Atores ---");

                    imdb.exibirTodosAtores();
                    break;
                case 3:
                    System.out.println("\n--- Cadastro de Diretor ---");

                    System.out.println("Digite o nome do diretor: ");
                    String nomeDiretor = sc.nextLine();
                    System.out.println("Digite a idade do diretor: ");
                    int idadeDiretor = sc.nextInt();

                    Diretor diretor = new Diretor(nomeDiretor, idadeDiretor);

                    imdb.adicionarDiretor(diretor);
                    System.out.println("Diretor cadastrado!");

                    break;
                case 4:
                    System.out.println("\n--- Lista de Diretores ---");

                    imdb.exibirTodosDiretores();
                    break;
                case 5:
                    System.out.println("\n--- Cadastro de Filme ---");

                    System.out.println("Digite o nome do filme: ");
                    String nomeFilme = sc.nextLine();

                    System.out.println("Digite a descrição do filme: ");
                    String descricaoFilme = sc.nextLine();

                    System.out.println("Digite a data de lançamento do filme: ");
                    String dataDeLancamento = sc.nextLine();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = formatter.parse(dataDeLancamento);

                    System.out.println("Digite o orçamento do filme: ");
                    double orcamento = sc.nextDouble();

                    Filme filme = new Filme(nomeFilme, descricaoFilme, date, orcamento);

                    imdb.adicionarFilme(filme);
                    System.out.println("Filme cadastrado!");
                    break;
                case 6:
                    System.out.println("\n--- Adicionar Diretor em um Filme ---");

                    System.out.println("Primeiro digite o nome do filme que deseja atualizar: ");
                    String nomeFilmeAtualizar = sc.nextLine();

                    System.out.println("Primeiro digite o nome do diretor que deseja adicionar: ");
                    String nomeDiretorAdd = sc.nextLine();

                    imdb.adicionarDiretorEmFilme(nomeFilmeAtualizar, nomeDiretorAdd);
                    System.out.println("Filme atualizado!");
                    break;
                case 7:
                    System.out.println("\n--- Adicionar Atores em um Filme ---");

                    System.out.println("Primeiro digite o nome do filme que deseja atualizar: ");
                    String nomeFilmeAtualizarAtor = sc.nextLine();

                    System.out.println("Primeiro digite o nome do diretor que deseja adicionar: ");
                    String nomeAtorAdd = sc.nextLine();

                    imdb.adicionarAtoresEmFilme(nomeFilmeAtualizarAtor, nomeAtorAdd);
                    System.out.println("Filme atualizado!");
                    break;
                case 8:
                    System.out.println("\n--- Lista de Filmes ---");

                    imdb.exibirTodosFilmes();
                    break;
                case 9:
                    System.out.println("\n--- Pesquisa de Filme ---");

                    System.out.println("Digite o nome do filme: ");
                    String nomeBusca = sc.next();

                    System.out.println(imdb.buscarFilmePorNome(nomeBusca));
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Opção não encontrada, tente novamente!");
            }

        }
    }
}
