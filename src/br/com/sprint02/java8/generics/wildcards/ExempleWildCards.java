package br.com.sprint02.java8.generics.wildcards;


public class ExempleWildCards <T extends Number> {

    T num;

    // contrutor com o parametro generico
    public ExempleWildCards(T ob) {
        this.num = ob;
    }

    // verifica se o número passado no parâmetro é o mesmo da classe
    boolean absoluteValue(ExempleWildCards<?> ob) {
        return Math.abs(num.intValue()) == Math.abs(ob.num.intValue());
    }
}

