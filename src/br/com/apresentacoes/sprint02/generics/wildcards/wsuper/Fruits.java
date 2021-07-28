package br.com.apresentacoes.sprint02.generics.wildcards.wsuper;

import java.util.List;

public class Fruits {

    // metodos para processar as frutas

    public void processApple(List<Apple> apple){
        for (Apple a: apple) {
            System.out.println(a.getName());
        }
        System.out.println("Processing apples");
    }

    public void processOrange(List<Orange> orange){
        for (Orange o: orange) {
            System.out.println(o.getName());
        }
        System.out.println("Processing oranges");
    }

    public void processLemon(List<Lemon> lemon){
        for (Lemon l: lemon) {
            System.out.println(l.getName());
        }
        System.out.println("Processing lemons");
    }

    public void processPineapple(List<Pineapple> pineapple){
        for (Pineapple p: pineapple) {
            System.out.println(p.getName());
        }
        System.out.println("Processing pineapples");
    }

    public void processGrapes(List<Grape> grapes){
        for (Grape g: grapes) {
            System.out.println(g.getName());
        }
        System.out.println("Processing grapes");
    }



    // metodo processingFruits() com parametro utilizando Wildcards
    // pra uma lista desconhecida que extende Fruits, faz uma funcao
    public void processFruits(List<? extends Fruits> fruit){
        for (Fruits f: fruit) {
            System.out.println(f);
        }
        System.out.println("Processing fruits");
    }

}
