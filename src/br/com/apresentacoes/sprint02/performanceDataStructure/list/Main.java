package br.com.apresentacoes.sprint02.performanceDataStructure.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        LinkedList<Integer> linkedList3 = new LinkedList<>();


        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        //LinkedList método get
        final long start1 = System.nanoTime();
        linkedList.get(100);
        final long end1 = System.nanoTime();

        //ArrayList método get
        final long start2 = System.nanoTime();
        arrayList.get(100);
        final long end2 = System.nanoTime();

        long totalTimeLL1 = end1 - start1;
        long totalTimeAL1 = end2 - start2;


        //LinkedList método remove()
        final long start3 = System.nanoTime();
        linkedList.remove(50000);
        final long end3 = System.nanoTime();

        //ArrayList método remove()
        final long start4 = System.nanoTime();
        arrayList.remove(50000);
        final long end4 = System.nanoTime();

        long totalTimeLL2 = end3 - start3;
        long totalTimeAL2 = end4 - start4;


        //ArrayList método add()
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList1.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\n--------------------------------");
        System.out.println("Método add -- ArrayList: " + duration);

        //LinkedList método add()

        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList1.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Método add -- LinkedList: " + duration);


        //ArrayList método set()
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList2.add(i);
        }
        arrayList2.set(5000, 50);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime2;
        System.out.println("--------------------------------");
        System.out.println("Método set -- ArrayList: " + duration3);

        //LinkedLIst método set()
        long startTime4 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList2.add(i);
        }
        linkedList2.set(5000, 50);
        long endTime4 = System.nanoTime();
        long duration4 = endTime4 - startTime4;
        System.out.println("Método set -- LinkedList: " + duration4);


        for (int i = 0; i < 10000000; i++) {
            linkedList3.add(i);
            arrayList3.add(i);
        }

        //LinkedList método remove first
        final long start5 = System.nanoTime();
        linkedList3.remove(0);
        final long end5 = System.nanoTime();

        //ArrayList método remove first
        final long start6 = System.nanoTime();
        arrayList3.remove(0);
        final long end6 = System.nanoTime();

        long totalTimeLL3 = end5 - start5;
        long totalTimeAL3 = end6 - start6;


        System.out.println("--------------------------------");
        System.out.println("Método remove in first position -- ArrayList: " + totalTimeAL3);
        System.out.println("Método remove in first position -- LinkedList: " + totalTimeLL3);
        System.out.println("--------------------------------");
        System.out.println("Método get -- LinkedList: " + totalTimeLL1);
        System.out.println("Método get -- ArrayList: " + totalTimeAL1);
        System.out.println("--------------------------------");
        System.out.println("Método remove -- LinkedList: " + totalTimeLL2);
        System.out.println("Método remove -- ArrayList: " + totalTimeAL2);
        System.out.println("--------------------------------");

    }
}