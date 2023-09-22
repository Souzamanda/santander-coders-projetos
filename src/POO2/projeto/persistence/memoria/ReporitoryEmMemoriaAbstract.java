package POO2.projeto.persistence.memoria;

import POO2.projeto.model.Entidade;
import POO2.projeto.persistence.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ReporitoryEmMemoriaAbstract<E extends Entidade<ID>, ID> implements Repository<E, ID> {
    private Map<ID, E> dados = new HashMap<>();

    @Override
    public E salvar(E entidade) {
        E entidadeJaCadastrada = buscarPorId(entidade.getId());
        if(entidadeJaCadastrada != null) {
            remover(entidadeJaCadastrada);
        }
        dados.put(entidade.getId(), entidade);
        return entidade;
    }

    @Override
    public boolean remover(E entidade) {
        return removerPorId(entidade.getId());
    }

    @Override
    public boolean removerPorId(ID identificador) {
        E entidadeRemovida = dados.remove(identificador);
        return entidadeRemovida != null;
    }

    @Override
    public List<E> listarTodos() {
        return new ArrayList<>(dados.values());
    }

    @Override
    public E buscarPorId(ID identificador) {
        return dados.get(identificador);
    }
}
