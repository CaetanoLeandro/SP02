package br.com.apresentacoes.sprint02.equalsHashcode.example01;

public class Main {
    public static void main(String[] args) {
        String a = "Giovane";
        String b = "Isabella";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        // hashcode é mais rapido de ser calculado, porém nao é 100% efetivo, retorna hash

        // equals é mais lento, porém é 100% efetivo, retorna true ou false
    }
}
