package br.com.apresentacoes.sprint01.enumerator.inside.example03;

public class ConceitosEnum {

    enum Notas{
        OTIMO, BOM, REGULAR, RUIM
    }

    public static void calcularAprovocao(Notas conceito){
        if (conceito == Notas.BOM) {
            System.out.println("Aprovado!");
        }else if(conceito == Notas.REGULAR){
            System.out.println("Regular.");
        }else if(conceito == Notas.OTIMO){
            System.out.println("Aprovado, destaque!!!");
        }else if(conceito == Notas.RUIM){
            System.out.println("Reprovado.");
        }
        }

}

