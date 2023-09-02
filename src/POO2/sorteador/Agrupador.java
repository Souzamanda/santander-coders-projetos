package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Agrupador<T> {
    List<T> elementos;
    Sorteador<T> sorteador;

    public List<Grupo<T>> agrupar(int numeroDeGruposEsperado) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperado);


        while(possuiElementos()) {
            for(Grupo<T> grupo : grupos) {
                grupo.adicionarNoGrupo(sorteador.sortear());
            }
        }

        return grupos;
    }

    private List<Grupo<T>> inicializarGrupos(int numeroDeGruposEsperado) {
        List<Grupo<T>> grupos = new ArrayList<>();
        for (int i = 1; i <= numeroDeGruposEsperado; i++) {
            Grupo<T> grupo = new Grupo<>(new ArrayList<>(), i);
            grupos.add(grupo);
        }
        return grupos;
    }

    private boolean possuiElementos() {
        return !elementos.isEmpty();
    }
}
