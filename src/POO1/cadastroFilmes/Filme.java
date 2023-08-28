package POO1.cadastroFilmes;

import java.util.ArrayList;
import java.util.Date;

public class Filme {
    private String nome, descricao;
    private Date diaDeLancamento;
    private double orcamento;
    private Diretor diretor;
    private ArrayList<Ator> atores = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDiaDeLancamento() {
        return diaDeLancamento;
    }

    public void setDiaDeLancamento(Date diaDeLancamento) {
        this.diaDeLancamento = diaDeLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }

    public void setAtores(Ator ator) {
        this.atores.add(ator);
    }

    public Filme() {
    }

    public Filme(String nome, String descricao, Date diaDeLancamento, double orcamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.diaDeLancamento = diaDeLancamento;
        this.orcamento = orcamento;
    }

    @Override
    public String toString() {
        return  nome +
                "\nDescricao: " + descricao +
                "\nLançado em: " + diaDeLancamento +
                "\nOrçamento: " + orcamento +
                "\nDiretor: " + diretor +
                "\nAtores: " + atores;
    }
}
