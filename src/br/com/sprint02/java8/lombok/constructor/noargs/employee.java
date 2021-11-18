package br.com.sprint02.java8.lombok.constructor.noargs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class employee {
    private String name;
    private int id;
}
