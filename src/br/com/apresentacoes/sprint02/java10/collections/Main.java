package br.com.apresentacoes.sprint02.java10.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // novos metodos de copias de listas

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // unmodifiableList = nao sera refletida a mudanca da lista original se for modificada
        List<Number> unmodifiableList = Collections.unmodifiableList(list);

        // copyOf = sera refletida a mudanca da lista original se for modificada
        List<Integer> copyOfList = List.copyOf(list);

        // modificando a lista original
        list.add(3);

        System.out.println("unmodifiableList: " + unmodifiableList);
        System.out.println("copyOfList: " + copyOfList);
    }
}
