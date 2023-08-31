package POO2.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {
    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        if(elementos.isEmpty()) {
            return null;
        }
        Random randomInt = new Random();
        int numeroSorteado = randomInt.nextInt(elementos.size());
        return elementos.remove(numeroSorteado);
    }

    public List<Grupo> agrupar(int numeroDeGruposEsperado) {
        List<Grupo> grupos = new ArrayList<>();
        for (int i = 1; i <= numeroDeGruposEsperado; i++) {
            Grupo grupo = new Grupo(new ArrayList<>(), i);
            grupos.add(grupo);
        }

        while(!elementos.isEmpty()) {
            for(Grupo grupo : grupos) {
                grupo.adicionarNoGrupo(sortear());
            }
        }

        return grupos;
    }
}
