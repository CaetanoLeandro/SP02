package br.com.apresentacoes.sprint02.java8.generics.classes.multiples;

public class Faculdade<T, V>{

    // utilizando Generics em Variables
    T t;
    V v;

    // utilizando Generics em Constructor
    public Faculdade(T t, V v) {
        this.t = t;
        this.v = v;
    }
}
