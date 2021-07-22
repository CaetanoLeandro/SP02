package br.com.apresentacoes.sprint02.interfacesFuncionais.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Data
public class Product {
    private String name;
    private double price;

    public static boolean isEven(int t){
        return (t % 2) == 0;
    }
}
