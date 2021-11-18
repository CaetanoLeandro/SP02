package br.com.sprint02.java8.lombok.constructor.allargs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Test {
    private String name;
    private int employmentTime;
    private double id;
    private final double salary = 5000.00;
    String placeOfBirth = "Porto Alegre";

}
