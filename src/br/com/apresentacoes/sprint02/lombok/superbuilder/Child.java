package br.com.apresentacoes.sprint02.lombok.superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Child extends Parent {
    private String childName;
    private int childAge;
}
