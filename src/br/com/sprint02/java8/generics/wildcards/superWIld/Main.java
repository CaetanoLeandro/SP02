package br.com.sprint02.java8.generics.wildcards.superWIld;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatMethod catMethod = new CatMethod();

        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<MyCat> myCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        catMethod.addMethod(animalList);
        catMethod.addMethod(catList);
//        catMethod.addMethod(myCatList);
//        catMethod.addMethod(dogList);

    }
}
