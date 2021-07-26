package br.com.apresentacoes.sprint01.estruturadedados.performance.map.ordenacao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1001, "Um");
        hashMap.put(1002, "Dois");
        hashMap.put(1003, "Três");
        hashMap.put(1004, "Quatro");
        hashMap.put(1005, "Cinco");
        hashMap.put(1006, "Seis");
        hashMap.put(1007, "Sete");
        hashMap.put(1008, "Oito");
        hashMap.put(1009, "Nove");
        hashMap.put(1010, "Dez");
        System.out.println("Hashmap: " + hashMap.keySet());

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1001, "Um");
        linkedHashMap.put(1002, "Dois");
        linkedHashMap.put(1003, "Três");
        linkedHashMap.put(1004, "Quatro");
        linkedHashMap.put(1005, "Cinco");
        linkedHashMap.put(1006, "Seis");
        linkedHashMap.put(1007, "Sete");
        linkedHashMap.put(1008, "Oito");
        linkedHashMap.put(1009, "Nove");
        linkedHashMap.put(1010, "Dez");
        System.out.println("LinkedHashMap: " + linkedHashMap.keySet());

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1001, "Um");
        treeMap.put(1002, "Dois");
        treeMap.put(1003, "Três");
        treeMap.put(1004, "Quatro");
        treeMap.put(1005, "Cinco");
        treeMap.put(1006, "Seis");
        treeMap.put(1007, "Sete");
        treeMap.put(1008, "Oito");
        treeMap.put(1009, "Nove");
        treeMap.put(1010, "Dez");
        System.out.println("TreeMap: " + treeMap.keySet());

    }
}