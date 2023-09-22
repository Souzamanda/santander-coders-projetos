package POO2.projeto.persistence;

import POO2.projeto.model.Entidade;

import java.util.List;

public interface Repository<T extends Entidade<ID>, ID> {
    T salvar(T entidade);
    boolean remover(T entidade);
    boolean removerPorId(ID identificador);
    List<T> listarTodos();
    T buscarPorId(ID identificador);
}
