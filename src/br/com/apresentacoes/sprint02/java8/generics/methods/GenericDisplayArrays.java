package br.com.apresentacoes.sprint02.java8.generics.methods;

public class GenericDisplayArrays<T>{
    public void display(T[] a){
        for (T t: a) {
            System.out.println(t);
        }
    }
}
