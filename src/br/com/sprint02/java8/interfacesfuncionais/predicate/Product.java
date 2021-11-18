package br.com.sprint02.java8.interfacesfuncionais.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Product { Name: "+ this.name+ String.format(" Price: %.2f }", this.price);
    }
}
