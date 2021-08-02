package br.com.apresentacoes.sprint02.lombok.superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@SuperBuilder
@Getter
public class Parent {
    private String parentName;
    private int parentAge;
}
