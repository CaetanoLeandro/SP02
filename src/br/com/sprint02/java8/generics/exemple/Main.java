package br.com.sprint02.java8.generics.exemple;

public class Main{


    public static void main(String[] args) {

            // Informando o tipo de cada parametro e mostrando
            GenericClass<Integer, String> obj = new GenericClass<>(30, "Leandro");
            obj.dataType();
        }
    }


