package br.com.apresentacoes.sprint01.threads.runnable;

public class ClasseRunnable implements Runnable{

    private String nome;

    public ClasseRunnable(String nome){
        this.nome = nome;
    }

    @Override
    public void run() {

        try {
            for(int i = 1; i<=5; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
