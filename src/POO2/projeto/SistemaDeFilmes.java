package POO2.projeto;

import POO2.projeto.model.Ator;
import POO2.projeto.persistence.memoria.AtorReporitoryEmMemoria;
import POO2.projeto.persistence.memoria.DiretorReporitoryEmMemoria;

public class SistemaDeFilmes {
    public static void main(String[] args) {
        AtorReporitoryEmMemoria atorRepository = new AtorReporitoryEmMemoria();
        atorRepository.salvar(new Ator("12345", "Jhon Travolta"));
        atorRepository.salvar(new Ator("122", "Angelina Jolie"));
        Ator morganFreeman = new Ator("999999", "Morgan Freeman");
        atorRepository.salvar(morganFreeman);

        System.out.println(atorRepository.listarTodos());

        atorRepository.salvar(new Ator("122", "Megan Fox"));
        System.out.println(atorRepository.listarTodos());

        atorRepository.remover(morganFreeman);
        System.out.println(atorRepository.listarTodos());

        System.out.println(atorRepository.buscarPorId("122"));
        System.out.println(atorRepository.remover(new Ator("555", null)));

        DiretorReporitoryEmMemoria diretorReporitory = new DiretorReporitoryEmMemoria();
    }
}
