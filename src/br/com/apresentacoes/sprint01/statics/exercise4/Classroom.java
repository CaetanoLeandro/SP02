package br.com.apresentacoes.sprint01.statics.exercise4;

public class Classroom {
        private String aluno;
        private static String professor = "Paulo";
        public String aula = "Biologia";

        public Classroom(String aluno) {
            this.aluno = aluno;
        }

        public void exibeDados(){
            System.out.println("Aluno: "+ aluno);
            System.out.println("Professor: "+ professor);;
        }

    /*
    public void exibeAula(){
        System.out.println("Aula da turma 303: " + aula);
        System.out.println("Horario: 9:30 da manhã.");
    }
     */
}


