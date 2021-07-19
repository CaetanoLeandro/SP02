package br.com.apresentacoes.sprint01.polimorfismo.overload;

public class Calculadora{

    public int calcula(int a,int b){
        return a + b;
    }

    public int calcula(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String args[]){
        Calculadora calc= new Calculadora();

        System.out.println(calc.calcula(1,1));
        System.out.println(calc.calcula(1,1,1));
    }
}