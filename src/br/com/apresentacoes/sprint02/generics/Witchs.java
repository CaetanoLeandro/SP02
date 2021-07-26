package br.com.apresentacoes.sprint02.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Witchs implements Action{
    private String name;
    private String blood;

    @Override
    public void throwCard(Object c) {
    }
}
