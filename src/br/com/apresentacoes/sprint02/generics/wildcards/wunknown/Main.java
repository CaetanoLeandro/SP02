package br.com.apresentacoes.sprint02.generics.wildcards.wunknown;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Apple> apple = new ArrayList<>();
        apple.add(new Apple("Apple 1"));
        apple.add(new Apple("Apple 2"));
        apple.add(new Apple("Apple 3"));
        apple.add(new Apple("Apple 4"));

        Fruits nomes = new Fruits();
        nomes.processApple(apple);

















//        List<Apple> appleList = new ArrayList<>();
//        appleList.add(new Apple("dwfe"));
//        processElements();
//
//        List<Orange> orangeList = new ArrayList<>();
//        processElements(orangeList);
    }

//    public static  void processElements(List<? extends Fruits> elements){
//        for (Fruits f:elements) {
//            System.out.println(f);
//        }
//    }

}
