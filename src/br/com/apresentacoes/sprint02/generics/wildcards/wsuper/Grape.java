package br.com.apresentacoes.sprint02.generics.wildcards.wsuper;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Grape extends Fruits{
    private String name;

    @Override
    public String toString() {
        return this.name;
    }
}
