package br.com.alura.screenmatch.exercicios.aula;

public class ProdutoPerecivel extends Produtos{
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade ;
    }

    @Override
    public String toString() {
        return super.toString() + " Data de validade: " + dataDeValidade;
    }
}
