package br.com.apresentacoes.sprint02.generics;

@FunctionalInterface
public interface Action<T>{

    void throwCard(T c);

    default void especial(T f){
        System.out.println("Spelling a curse");
    }

    default void especial2(){
        System.out.println("Spelling a curse");
    }
}
