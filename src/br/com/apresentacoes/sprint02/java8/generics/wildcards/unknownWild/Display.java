package br.com.apresentacoes.sprint02.java8.generics.wildcards.unknownWild;

import java.util.List;

public class Display {
    // se eu colocar extends eu limito o uso do Metodo só para Classes que estendem a Classe desejada
    // List<?> significa um tipo de lista para um tipo de lista desconhecido
    public void displayList(List<?> elements){
        for(Object o : elements){
            System.out.println(o);
        }
    }
}
