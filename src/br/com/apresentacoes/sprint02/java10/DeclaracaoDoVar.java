package br.com.apresentacoes.sprint02.java10;

import java.util.List;
import java.util.Scanner;

public class DeclaracaoDoVar {

    // var nao funciona em variaveis globais
    String nome = "Giovane";
    //var nome2 = "Giovane"

    private static void funciona(){

        // variaveis locais com inicializacao
        var i = 50;
        var nome = "Cinquenta";

        // utilizando Scanner
        var s = new Scanner(System.in);

        // list
        var list = List.of(1, 2, 3);

        // for each
        for (var listagem: list) {     // nao é muito recomendado, pois nao deixa claro qual o tipo da lista
            System.out.println("");
        }

    }

    private static void naoFunciona(){

        // variaveis locais sem inicializacao
        // var nome;
        // obrigatoria a inicializacao, pois o Java não sabe o tipo da variável

        // lambda
        // Runnable r1 = () -> System.out.println("Testando lambda");
        // var r2 = () -> System.out.println("Testando lambda");
        // var nao funciona em expressao lambda porque o Java nao reconhece qual interface esta sendo utilizada


        // argumento de metodo e construtor
        // private static void naoPode(var nome){}
        // nao deixa claro que nome, por exemplo, é uma String


        // retorno de metodo
        // private static var naoPode(String name){}
        // var nao é um tipo, por isso nao da pra retornar var, var é só uma palavra que tu coloca no lugar do tipo


        // uso do var = reduzir repeticao
        // var nao é palavra reservada
    }
}
