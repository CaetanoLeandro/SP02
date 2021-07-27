package br.com.apresentacoes.sprint02.generics.classes.multiples;

public class Faculdade<T, V>{

    // utilizando Generics em Variables
    T t;
    V v;

    // utilizando Generics em Constructor
    public Faculdade(T m, V n) {
        this.t = m;
        this.v = n;
    }

}
