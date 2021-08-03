package br.com.apresentacoes.sprint02.java8.generics.wildcards.unknownWild;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<C> listC = new ArrayList<>();
        List<D> listD = new ArrayList<>();

        Display test = new Display();
        test.displayList(listA);
        test.displayList(listB);
        test.displayList(listC);
        test.displayList(listD);


    }

    static class A {}
    static class B {}
    static class C {}
    static class D {}

}
