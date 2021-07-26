package br.com.apresentacoes.sprint01.estruturadedados.performance.map.performance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();




        long startTime = System.nanoTime();
        for (int i = 0; i <=100; i++) {
            hashMap.put(i, i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\n--------------------------------");
        System.out.println("Método put -- HashMap: " + duration);


        long startTime1 = System.nanoTime();
        for (int i = 0; i <=100; i++) {
            treeMap.put(i,i);
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("--------------------------------");
        System.out.println("Método put -- TreeMap: " + duration1);


        long startTime2 = System.nanoTime();
        for (int i = 0; i <=100; i++) {
            linkedHashMap.put(i,i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("--------------------------------");
        System.out.println("Método put -- LinkedHashMap: " + duration2);


        if(duration < duration1 & duration < duration2){
            System.out.println("--------------------------------");
            System.out.println("HashMap menos tempo metodo put");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration1 < duration2){
            System.out.println("--------------------------------");

            System.out.println("TreeMap menos tempo metodo put");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashMap menos tempo metodo put");
            System.out.println("--------------------------------\n\n\n");
        }


        long startTime3 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashMap.remove(100000);

        }
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;
        System.out.println("\n--------------------------------");
        System.out.println("Método remove -- HashMap: " + duration3);


        long startTime4 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            treeMap.remove(100000);
        }
        long endTime4 = System.nanoTime();
        long duration4 = endTime4 - startTime4;
        System.out.println("--------------------------------");
        System.out.println("Método remove -- TreeMap: " + duration4);


        long startTime5 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashMap.remove(100000);
        }
        long endTime5 = System.nanoTime();
        long duration5 = endTime5 - startTime5;
        System.out.println("--------------------------------");
        System.out.println("Método remove -- LinkedHashMap: " + duration5);


        if(duration3 < duration4 & duration3 < duration5){
            System.out.println("--------------------------------");
            System.out.println("HashMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration4 < duration5){
            System.out.println("--------------------------------");

            System.out.println("TreeMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }








        long startTime6 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashMap.get(500000);
        }
        long endTime6 = System.nanoTime();
        long duration6 = endTime6 - startTime6;
        System.out.println("\n--------------------------------");
        System.out.println("Método get -- HashMap: " + duration6);


        long startTime7 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            treeMap.get(500000);
        }
        long endTime7 = System.nanoTime();
        long duration7 = endTime7 - startTime7;
        System.out.println("--------------------------------");
        System.out.println("Método get -- TreeMap: " + duration7);


        long startTime8 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedHashMap.get(500000);

        }
        long endTime8 = System.nanoTime();
        long duration8 = endTime8 - startTime8;
        System.out.println("--------------------------------");
        System.out.println("Método get -- LinkedHashMap: " + duration8);


        if(duration6 < duration7 & duration6 < duration8){
            System.out.println("--------------------------------");
            System.out.println("HashMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else if(duration7 < duration8){
            System.out.println("--------------------------------");

            System.out.println("TreeMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }else{
            System.out.println("--------------------------------");
            System.out.println("LinkedHashMap menos tempo metodo remove");
            System.out.println("--------------------------------\n\n\n");
        }




    }
}