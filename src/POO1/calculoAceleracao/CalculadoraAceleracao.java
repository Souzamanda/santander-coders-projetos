package POO1.calculoAceleracao;

/**
 * Faça um programa para calcular a aceleração adquirida de um determinado objeto
 * de acordo com a sua força e massa, recordando que F=M.A.
 * <p>
 * O objeto deverá possuir como características força e massa.
 * Exemplo: Um carro com força de 2000 N (Newton) e 200 kg de massa deverá
 * possuir 10 m/s² de aceleração pois:
 * <p>
 * F=M.A
 * <p>
 * 2000=200.a = 2000/200 = a = 10m/s²
 */
public class CalculadoraAceleracao {
    private double forca;
    private double massa;

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public CalculadoraAceleracao() {
    }

    public CalculadoraAceleracao(double forca, double massa) {
        this.forca = forca;
        this.massa = massa;
    }

    public String calculoAceleracao() {
        double aceleracao = this.forca / this.massa;
        return "A aceleração adquirida é de " + aceleracao + "m/s²";
    }
}
