package br.com.sprint02.java8.generics.exemple;


// Interface parametrizada com Generics

public interface Testable<K,V> {

    public V get();
    public V add(K key, V value);
}
