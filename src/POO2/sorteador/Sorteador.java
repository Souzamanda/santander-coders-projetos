package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador<T> {
    private final List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    public T sortear() {
        if(elementos.isEmpty()) {
            return null;
        }
        Random randomInt = new Random();
        int numeroSorteado = randomInt.nextInt(elementos.size());
        return elementos.remove(numeroSorteado);
    }

    public List<Grupo<T>> agrupar(int numeroDeGruposEsperado) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperado);

        while(possuiElementos()) {
            for(Grupo<T> grupo : grupos) {
                grupo.adicionarNoGrupo(sortear());
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
