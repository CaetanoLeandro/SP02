package br.com.apresentacoes.sprint02.lombok.constructor.allargs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Test {
    private String name;
    private int idade;

    private static boolean defaultStatus;
    private double id;
    private final double minSalary = 10000.00;
    private final int defaultRole;


    // N0N-NULL ATRIBUTOS
//    public Test(@NonNull String name, int idade) {
//        if (name == null) {
//            throw new NullPointerException("name is marked non-null but is null");
//        }
//        this.idade = idade;
//        this.name = name;
//    }




    // @AllArgsConstructor(access = AccessLevel.PRIVATE)
//    private Test(String name, int idade) {
//        this.idade = idade;
//        this.name = name;
//    }




    // @AllArgsConstructor nunca gera argumento de construtor para atributos estáticos para @AllArgsConstructor
    // @AllArgsConstructor nao gera argumento de construtor para atributos final com valores inicializados
//    public Test(final double id, final int defaultRole) {
//        this.id = id;
//        this.defaultRole = defaultRole;
//    }

}
