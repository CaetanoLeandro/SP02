package br.com.apresentacoes.sprint02.lombok.constructor.noargs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private int idade;
}
