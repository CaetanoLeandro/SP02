package br.com.apresentacoes.sprint01.estruturadedados.performance.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\n--------------------------------");
        System.out.println("Método add -- HashSet: " + duration);


        long startTime1 = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            treeSet.add(i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("--------------------------------");
        System.out.println("Método add -- TreeSet: " + duration1);


        long startTime2 = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedHashSet.add(i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("--------------------------------");
        System.out.println("Método add -- LinkedHashSet: " + duration2);

        if(duration < duration1 & duration < duration2){
            System.out.println("--------------------------------");
            System.out.println("HashSet menos tempo metodo add");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration1 < duration2){
            System.out.println("--------------------------------");

            System.out.println("TreeSet menos tempo metodo add");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashSet menos tempo metodo add");
            System.out.println("--------------------------------\n\n\n");
        }

        long startTime3 = System.nanoTime();

        for (int i = 999999; i >=0 ; i--) {
            hashSet.remove(i);
        }
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;
        System.out.println("--------------------------------");
        System.out.println("Método remove -- HashSet: " + duration3);


        long startTime4 = System.nanoTime();

        for (int i = 999999; i >=0 ; i--) {
            treeSet.remove(i);
        }
        long endTime4 = System.nanoTime();
        long duration4 = endTime4 - startTime4;
        System.out.println("--------------------------------");
        System.out.println("Método remove -- TreeSet: " + duration4);


        long startTime5 = System.nanoTime();

        for (int i = 999999; i >=0 ; i--) {
            linkedHashSet.remove(i);
        }
        long endTime5 = System.nanoTime();
        long duration5 = endTime5 - startTime5;
        System.out.println("--------------------------------");
        System.out.println("Método remove -- LinkedHashSet: " + duration5);

        if(duration3 < duration4 & duration3 < duration5){
            System.out.println("--------------------------------");
            System.out.println("HashSet menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration3 < duration5){
            System.out.println("--------------------------------");
            System.out.println("TreeSet menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashSet menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }

        long startTime6 = System.nanoTime();

        for (int i = 0; i < 1000000 ; i++) {
            hashSet.contains(i);
        }
        long endTime6 = System.nanoTime();
        long duration6 = endTime6 - startTime6;
        System.out.println("--------------------------------");
        System.out.println("Método contains -- HashSet: " + duration6);

        long startTime7 = System.nanoTime();

        for (int i = 0; i < 1000000 ; i++) {
            treeSet.contains(i);
        }
        long endTime7 = System.nanoTime();
        long duration7 = endTime7 - startTime7;
        System.out.println("--------------------------------");
        System.out.println("Método contains -- TreeSet: " + duration7);

        long startTime8 = System.nanoTime();

        for (int i = 0; i < 1000000 ; i++) {
            treeSet.contains(i);
        }
        long endTime8 = System.nanoTime();
        long duration8 = endTime8 - startTime8;
        System.out.println("--------------------------------");
        System.out.println("Método contains -- LinkedHashSet: " + duration8);


        if(duration6 < duration7 & duration6 < duration8){
            System.out.println("--------------------------------");
            System.out.println("HashSet menos tempo metodo contains");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration6 < duration8){
            System.out.println("--------------------------------");
            System.out.println("TreeSet menos tempo metodo contains");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashSet menos tempo metodo contains");
            System.out.println("--------------------------------\n\n\n");
        }

    }
}
