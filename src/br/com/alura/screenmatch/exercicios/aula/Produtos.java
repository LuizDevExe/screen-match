package br.com.alura.screenmatch.exercicios.aula;


public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto " + this.nome + " Quantidade " + this.quantidade + " Preço " + this.preco;
    }
}
