package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Agrupador<T> {
    private final SorteadorMeio<T> sorteador;

    public Agrupador(List<T> elementos) {
        this.sorteador = new SorteadorMeio<>(elementos);
    }

    public List<Grupo<T>> agrupar(int numeroDeGruposEsperado) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperado);


        while(sorteador.possuiElementos()) {
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


}
