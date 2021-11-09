package br.com.sprint02.java8.lambda;


import java.util.function.*;

public class ShowClient implements Consumer<Client>{
    public void accept(Client c) {
        System.out.println(c.getNome());
        System.out.println(c.getSenha());
    }
}