package br.com.apresentacoes.sprint02.generics.wildcards.wunknown;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Apple extends Fruits{

    private String name;

    public void processElementsAple(List<Apple> elements){
        for (Apple a: elements) {
            System.out.println(a);
        }
    }
}
