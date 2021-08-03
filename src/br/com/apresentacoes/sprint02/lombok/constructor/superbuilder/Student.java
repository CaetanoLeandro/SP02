package br.com.apresentacoes.sprint02.lombok.constructor.superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Student extends Child {
    private String schoolName;
}
