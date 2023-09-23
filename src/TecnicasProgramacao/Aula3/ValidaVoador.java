package TecnicasProgramacao.Aula3;

public class ValidaVoador implements Validador{
    @Override
    public Boolean valida(Animal animal) {
        return animal.podeVoar();
    }
}
