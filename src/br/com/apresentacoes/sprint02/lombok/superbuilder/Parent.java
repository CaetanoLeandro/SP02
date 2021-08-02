package br.com.apresentacoes.sprint02.lombok.superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Parent {
    private String parentName;
    private int parentAge;
}
