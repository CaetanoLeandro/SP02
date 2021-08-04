package br.com.apresentacoes.sprint02.java11.stringnewmethods;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String original = "palavras PALAVRAS palavras    ";
        String newMethods = "        New methods String ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.replace('a','x');

        System.out.println("----------------------------");

        // toLowerCase
        System.out.println("Sem lower case: " + original);
        System.out.println("Com lower case: " + s1);
        System.out.println("----------------------------");

        // toUpperCase
        System.out.println("Sem upper case: " + original);
        System.out.println("Com upper case: " + s2);
        System.out.println("----------------------------");

        // trim  - remove os espaços nos cantos da String
        System.out.println("Sem trim: " + original);
        System.out.println("Com trim: " + s3);
        System.out.println("----------------------------");

        // substring  -  gera uma nova String de acordo com o caractere selecionado
        System.out.println("Sem substring: " + original);
        System.out.println("Com substring: " + s4);
        System.out.println("----------------------------");

        // replace - modifica o caractere antigo por um novo, no caso todos os 'a' pelo 'x'
        System.out.println("Sem replace: " + original);
        System.out.println("Com replace: " + s5);
        System.out.println("----------------------------");

        // novos metodos String
        // Java 11

        // isBlank
        boolean s6 = newMethods.isBlank();
        System.out.println(s6);

        System.out.println("----------------------------");

        // lines - retorna uma stream of lines separadas por terminador de linhas
        String s7 = "A\nB\nC\nD";
        Stream<String> lines = s7.lines();

        lines.forEach(System.out::println);

        System.out.println("----------------------------");

        // repeat
        String s8 = newMethods.repeat(3);
        System.out.println(s8);

        System.out.println("----------------------------");

        // strip - versao melhorada do trim
        String s9 = newMethods.strip();
        System.out.println("Com strip: "+ s9);
        System.out.println("Sem strip: " + newMethods);

        System.out.println("----------------------------");

        // stripLeading - remove os espacoes da "frente ?
        String s10 = newMethods.strip();
        System.out.println("Com stripLeading: "+ s10);
        System.out.println("Sem strip: " + newMethods);

        System.out.println("----------------------------");

        // stripTrailing
        String s11 = newMethods.stripTrailing();
        System.out.println("Com stripTrailing: "+ s11);
        System.out.println("Sem strip: " + newMethods);



    }
}
