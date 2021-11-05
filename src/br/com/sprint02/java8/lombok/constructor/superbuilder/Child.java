package br.com.sprint02.java8.lombok.constructor.superbuilder;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Child extends Parent {
    private String childName;
    private int childAge;
}
