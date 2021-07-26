package br.com.apresentacoes.sprint02.interfacesFuncionais.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.function.Supplier;

@AllArgsConstructor
@Data
public class Testando implements Supplier<Integer> {
    private String name;
    private double price;

    @Override
    public Integer get() {
        Integer i = new Random().nextInt(10);
        return i;
    }

}
