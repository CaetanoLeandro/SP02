package br.com.sprint02.java8.generics.wildcards;

public class Main {


        public static void main(String[] args) {

            ExempleWildCards<Integer> iOb = new ExempleWildCards<>(6);
            ExempleWildCards<Double> dOb = new ExempleWildCards<>(-7.0);

            System.out.println(iOb.absoluteValue(dOb));
        }

}
