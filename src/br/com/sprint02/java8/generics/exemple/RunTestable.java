package br.com.sprint02.java8.generics.exemple;


// Implementado a "Testable"

public class RunTestable implements Testable <Integer,String>{


        @Override
        public String get() {
            System.out.println();
            return null;
        }

    @Override
    public String add(Integer key, String value) {
        return null;
    }


//    @Override
//        public String put(Integer key, String value) {
//            System.out.println();
//            return null;
//        }

}