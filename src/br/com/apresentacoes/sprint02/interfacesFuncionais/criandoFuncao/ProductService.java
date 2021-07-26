package br.com.apresentacoes.sprint02.interfacesFuncionais.criandoFuncao;

import br.com.apresentacoes.sprint02.interfacesFuncionais.predicate.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    // criando funcao que recebe funcao como parametro
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p: list) {
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
