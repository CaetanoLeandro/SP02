package br.com.apresentacoes.sprint02.generics.wildcards.superWIld;

import java.util.List;

public class CatMethod {
    public void addMethod(List<? super Cat> catList){
        catList.add(new MyCat());
        System.out.println("Cat added");
    }
}
