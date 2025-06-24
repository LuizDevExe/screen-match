package br.com.alura.screenmatch.desafio;

import java.io.Serializable;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }



    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }



    @Override
    public String toString() {
        return "Compra: descrição = " + this.descricao + " - " + this.valor;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
