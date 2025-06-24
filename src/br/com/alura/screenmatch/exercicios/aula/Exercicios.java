package br.com.alura.screenmatch.exercicios.aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercicios {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        for (String s : lista) {
            System.out.println(s);
        }


        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        animal.fazerSom();

        ArrayList<Integer> listaComNumeros = new ArrayList<>();

        listaComNumeros.add(5);
        listaComNumeros.add(7);
        listaComNumeros.add(3);
        listaComNumeros.add(4);
        listaComNumeros.add(6);
        listaComNumeros.add(2);
        listaComNumeros.add(1);

        Collections.sort(listaComNumeros);
        System.out.println(listaComNumeros);

        Titulo titulo = new Titulo();
        titulo.setNome("Aurora");

        Titulo titulo2 = new Titulo();
        titulo2.setNome("Bob");
        Titulo titulo3 = new Titulo();
        titulo3.setNome("David");

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo);

        Collections.sort(listaTitulos);

        for (Titulo t : listaTitulos) {
            System.out.println(t.getNome());
        }

        List<String> exemplos = new LinkedList<>();

        exemplos.add("A");
        exemplos.add("B");
        exemplos.add("C");
        exemplos.add("D");

        System.out.println(exemplos);
    }
}
