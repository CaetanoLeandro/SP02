package br.com.sprint02.java8.generics.exemple;

import java.util.ArrayList;
import java.util.List;


public class beforeafter{

    public static void main(String[] args) {


        //--------------- TYPE-SAFETY IMPEDE O ERRO EM TEMPO DE EXECUÇÃO ------------------//

        // # ANTES #

        List lista = new ArrayList();
        lista.add("ABC");
        lista.add(12);    //Erro de ClassCastException em tempo de execução

        // # DEPOIS #

        List<String> lista1 = new ArrayList<String>();
        lista1.add("ABC");
        //lista1.add(12); //Erro de compilação

        //--------------- NO CASTING ------------------//

        // # ANTES #
        List  itens = new ArrayList();
        itens.add("Fones de ouvidos");
        String item = (String) itens.get(0);

        // # DEPOIS #

        List<String> itens1 = new ArrayList();
        itens.add("Fones de ouvidos");
        String item1 = itens1.get(0); //Sem casting


   }
}