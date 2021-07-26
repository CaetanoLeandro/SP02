package br.com.apresentacoes.sprint01.estruturadedados.apresentados.example04;

import java.util.HashMap;
import java.util.Map;

public class ListaDeContatos {
    public static void main(String[] args) {
        Map<Integer, String> matriculaAlunos = new HashMap<>();

        matriculaAlunos.put(1001, "Giovane");
        matriculaAlunos.put(1002, "Giovana");
        matriculaAlunos.put(1003, "Ana");
        matriculaAlunos.put(1004, "Matheu");
        matriculaAlunos.put(1005, "Pedro");
        matriculaAlunos.put(1006, "Carlos");
        matriculaAlunos.put(1007, "Bella");
        matriculaAlunos.put(1008, "Bella");


        System.out.println(matriculaAlunos.keySet());
    }
}