package br.com.apresentacoes.sprint01.enumerator.inside.exercise2;

public class Curso {
        enum Turno {
            MANHA, TARDE, NOITE
        }

        public static void main(String[] args) {

            Turno t = Turno.MANHA;

            switch (t) {
                case MANHA:
                    System.out.println("Seu turno é da manhã.");
                    break;
                case TARDE:
                    System.out.println("Seu turno é da tarde.");
                    break;
                case NOITE:
                    System.out.println("Seu turno é da noite.");
                    break;
            }
        }
}

