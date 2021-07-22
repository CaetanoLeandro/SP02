package br.com.apresentacoes.sprint01.enumerator.inside.exercise1;

public class Curso {
    private String nome;
    private int horas;
    private Turno turno;

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public int getHoras() {
        return horas;
    }
}

