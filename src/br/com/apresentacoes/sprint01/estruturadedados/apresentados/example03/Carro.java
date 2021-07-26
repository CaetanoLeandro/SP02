package br.com.apresentacoes.sprint01.estruturadedados.apresentados.example03;

public class Carro implements Comparable{
    private int ano=0;
    private String nome;

    public Carro(int ano, String nome){
        this.ano = ano;
        this.nome = nome;
    }

    public int getAno(){
        return this.ano;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public int compareTo(Object o) {
        Carro car = (Carro) o;
        if(getAno() > car.getAno()){
            return 1;
        }else{
            if(getAno() < car.getAno()){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}