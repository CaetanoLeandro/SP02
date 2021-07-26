package br.com.apresentacoes.sprint01.finals.methods.example01;

public class CannotChange {

    public void sayHi(){
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
       CannotChange f = new CannotChange();
       f.sayHi();
    }



}

class OtherClass extends CannotChange {

   public void sayHi(){                     //can't override method sayHi.
   System.out.println("Hello!");
    }

}

