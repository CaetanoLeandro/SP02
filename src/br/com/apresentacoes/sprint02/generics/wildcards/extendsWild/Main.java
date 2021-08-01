package br.com.apresentacoes.sprint02.generics.wildcards.extendsWild;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Apple> apple = new ArrayList<>();
        apple.add(new Apple("Apple 1"));
        apple.add(new Apple("Apple 2"));
        apple.add(new Apple("Apple 3"));
        apple.add(new Apple("Apple 4"));

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange("Orange 1"));
        oranges.add(new Orange("Orange 2"));
        oranges.add(new Orange("Orange 3"));
        oranges.add(new Orange("Orange 4"));

        List<Grape> grapes = new ArrayList<>();
        grapes.add(new Grape("Grape 1"));
        grapes.add(new Grape("Grape 2"));
        grapes.add(new Grape("Grape 3"));
        grapes.add(new Grape("Grape 4"));

        List<Lemon> lemons = new ArrayList<>();
        lemons.add(new Lemon("Lemon 1"));
        lemons.add(new Lemon("Lemon 2"));
        lemons.add(new Lemon("Lemon 3"));
        lemons.add(new Lemon("Lemon 4"));

        List<Pineapple> pineapples = new ArrayList<>();
        pineapples.add(new Pineapple("Pineapple 1"));
        pineapples.add(new Pineapple("Pineapple 2"));
        pineapples.add(new Pineapple("Pineapple 3"));
        pineapples.add(new Pineapple("Pineapple 4"));


        // sem Wildcards
        Fruits fruitApple = new Fruits();
        fruitApple.processApple(apple);

        Fruits frutaOrange = new Fruits();
        frutaOrange.processOrange(oranges);

        Fruits fruitGrape = new Fruits();
        fruitGrape.processGrapes(grapes);

        Fruits fruitLemon = new Fruits();
        fruitLemon.processLemon(lemons);

        Fruits fruitPineapple = new Fruits();
        fruitPineapple.processPineapple(pineapples);


        // com Wildcards
        Fruits process = new Fruits();
        process.processFruits(apple);

        Fruits process2 = new Fruits();
        process2.processFruits(oranges);

        Fruits process3 = new Fruits();
        process3.processFruits(grapes);

        Fruits process4 = new Fruits();
        process4.processFruits(lemons);

        Fruits process5 = new Fruits();
        process5.processFruits(pineapples);

    }
}
