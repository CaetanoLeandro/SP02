package br.com.java9to11;
//JEP 323: Local-Variable Syntax for Lambda Parameters
// Possibiltou o uso da palavra reservada "VAR" dentro da função lambda

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;

public class jep323 {



    public static void main(String[] args) {

        List list = List.of(10);
        list.forEach((Interger) -> System.out.println(list)); // Java 10


        List<Integer> lista = List.of(1,2,3,4,5);
        lista.forEach((var e) -> System.out.println(e)); // Java 11
    }
}
