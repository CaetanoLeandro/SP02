package br.com.apresentacoes.sprint02.java8.generics.methods;

public class DisplayArrays {

    // só compativel com Array de inteiros
    public void displayInteger(Integer[] array){
        for (Integer I: array) {
            System.out.println(I);
        }
    }
    // só compativel com Array de doubles
    public void displayDouble(Double[] array){
        for (Double D: array) {
            System.out.println(D);
        }
    }
    // só compativel com Array de Strings
    public void displayString(String[] array){
        for (String S: array) {
            System.out.println(S);
        }
    }
    // só compativel com Array de caracteres
    public void displayChar(Character[] array){
        for (Character C: array) {
            System.out.println(C);
        }
    }

}
