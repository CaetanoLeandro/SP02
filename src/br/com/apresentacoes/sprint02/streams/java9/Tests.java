package br.com.apresentacoes.sprint02.streams.java9;

import java.util.stream.Stream;

public class Tests {
    public static void main(String args[]) {
        System.out.println("TutorialsPoint");
        int count = (int) Stream.ofNullable(5000).count();
        System.out.println(count);
        System.out.println("Tutorix");
        count = (int) Stream.ofNullable(null).count();
        System.out.println(count);
    }
}
