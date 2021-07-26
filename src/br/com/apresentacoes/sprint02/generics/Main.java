package br.com.apresentacoes.sprint02.generics;

public class Main {
    public static void main(String[] args) {
        Witchs w1 = new Witchs("Harry Potter", "pure blood");
        Witchs w2 = new Witchs("Harry Potter2", "pure blood2");
        w1.throwCard('I');
        w1.throwCard(10);

//        if(w1.throwCard(10) == w2.throwCard('I')){
//            System.out.println("");
//        }

    }

}

/*
* Powers:
*
* 10
* 20
* 30
* 35
* 40
*
* I
* L
* T
* E
* S
*
*
*
 */