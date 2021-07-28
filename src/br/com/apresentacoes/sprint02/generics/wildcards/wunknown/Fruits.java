package br.com.apresentacoes.sprint02.generics.wildcards.wunknown;

import java.util.List;

public class Fruits {

    public void processApple(List<Apple> apple){
        for (Apple a: apple) {
            System.out.println(a);
        }
    }

    public void processOrange(List<Orange> orange){
        for (Orange o: orange) {
            System.out.println(o);
        }
    }


    // wildcard é o nome dado ao identificador  ?
}
