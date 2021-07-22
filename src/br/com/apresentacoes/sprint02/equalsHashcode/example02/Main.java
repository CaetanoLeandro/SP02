package br.com.apresentacoes.sprint02.equalsHashcode.example02;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Giovane", "giovane@gmail.com");
        Cliente c2 = new Cliente("Isabella", "isabella@gmail.com");

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
