package br.com.sprint02.java8.generics.wildcards.extendsWild;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Apple extends Fruits {
    private String name;

    @Override
    public String toString() {
        return this.name;
    }
}
