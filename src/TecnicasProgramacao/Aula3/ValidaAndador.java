package TecnicasProgramacao.Aula3;

public class ValidaAndador implements Validador{
    @Override
    public Boolean valida(Animal animal) {
        return animal.podeAndar();
    }
}
