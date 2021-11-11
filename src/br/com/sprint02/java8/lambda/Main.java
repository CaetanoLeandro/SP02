package br.com.sprint02.java8.lambda;

import java.util.Arrays;
import java.util.List;


//Redução de linha de código e viabilização de programação funcional
//Criada para quando não será reaproveitada (performanc
// (implementa apenas classes FUNCIONAIS (apenas um método).
//Seu uso é indicado principalmente para o uso no método streams

public class Main {

    public static void main(String[] args) {

            Client c1 = new Client("Leandro", true, "123");
            Client c2 = new Client("Caetano", true, "456");
            c1.autenticaSenha("852");

            List<Client> clients = Arrays.asList(c1, c2);
            ShowClient mc = new ShowClient();
            clients.forEach(mc);

            clients.forEach(c -> System.out.println(c.getNome())); //EXPRESSÃO LAMBDA (parãmetro -> implementação
             // do método). Neste caso, não há a necessidade de usar "Client c ", pois o compilador identifica o tipo,
             // automaticamente.

            Runnable r = () -> System.out.println("Program Lambda"); //Neste caso não há necessidade de passar o
            // parâmetro, pois dentro da classe há apenas argumento.
            new Thread(r).start();

        }
    }











// ShowClient mc = new ShowClient();
// clientes.forEach(mc);

// Consumer<Client> consumidor = new Consumer<Client>(){ //CLASSE ANÔNIMA tem apenas o m[étodo accpt
//     public void accept(Client c){//Usado quando não há necessidade de reaproveitamento de código
//usado em apenas em un determinado ponto do código
//         System.out.println(c.getNome());
//     }
// };
//clientes.forEach(consumidor);