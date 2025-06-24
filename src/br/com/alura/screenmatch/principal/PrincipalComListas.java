package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
//        Produtos produto1 = new Produtos("Caderno", 19.90 , 5);
//        Produtos produto2 = new Produtos("Estojo", 29.90 , 10);
//        Produtos produto3 = new Produtos("Régua", 30.90 , 5);
//
//        ArrayList<Produtos> produtos = new ArrayList<>();
//        produtos.add(produto1);
//        produtos.add(produto2);
//        produtos.add(produto3);
//
//        // For each
//        for (Produtos produto : produtos) {
//            System.out.println(produto);
//        }
//
//        System.out.println("Tamanho da Lista: " + produtos.size());
//
//        ProdutoPerecivel leite =   new ProdutoPerecivel("Leite", 9.90, 20, "10/08/2025");
//        System.out.println(leite);

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);

            if ( item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);



    }
}
