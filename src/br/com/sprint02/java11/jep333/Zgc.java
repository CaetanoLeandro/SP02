package br.com.sprint02.java11.jep333;

///Scalable Low-Latency Garbage Collector
//Os tempos de pausa do GC não devem exceder 10 ms
//Lida com heaps que variam de relativamente pequenos
//Não mais do que 15% de redução de taxa de transferência do aplicativo em comparação com o uso de G1

public class Zgc {

    public static void obterMemoriaUsada(){

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime(); //singleton

        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);

    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[5000000];
        Contato contato;

        for (int i=0; i<contatos.length; i++){
            contato = new Contato("Contato"+i, "1234-56789"+i, "contato"+i+"@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");

        obterMemoriaUsada();

        contatos = null;

        Runtime.getRuntime().runFinalization();

        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");

        obterMemoriaUsada();
    }
}

