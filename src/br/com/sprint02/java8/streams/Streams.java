package br.com.sprint02.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

    List<Integer> listas = Arrays.asList(1,2,3,4,5,6,7,0,8,4,2,3,6,10);

    listas.stream()

            //Opeações intermediárias
            .skip(2) // Método que pula/ignora os dois primeiros elementos do stream
            .limit(3) // Método limita p processamento de apenas 3 elementos do stream
            .distinct() // Método não permte o uso elementos repetidos do stream, para isso, ele usa equals e hascode
            .filter(e -> e % 2 ==0) // Filtra alguma caracteristca específica (ex.retorna apenas números pares)
            .map(e -> e * 2) // Transforma e retorna elementos da lista (ex. multiplicação) *Obs: a lista original NÃO
            //é modificada
            .forEach(e -> System.out.println(e));
    }
}