package br.com.sprint02.java8.lambda;

    public class Client implements Authenticate {
        private String nome;
        private boolean status;
        private String senha;
        private int pontos;

        public Client(String nome, boolean status, String senha){
            this.nome = nome;
            this.status = status;
            this.senha = senha;
            this.pontos = pontos;
        }

        public Client(){

        }
        public String getNome(){
            System.out.println(this.nome);
            return this.nome;
        }

        public boolean getStatus(){
            return this.status;
        }

        public String getSenha(){
            return this.senha;
        }

        public int getPontos(){
            return this.pontos;
        }

        public boolean autenticaSenha(String senha) {
            if(this.senha != senha){
                System.out.println("Não autenticado!");
                return false;
            }
            System.out.println("Autenticado!");
            return true;
        }


    }
