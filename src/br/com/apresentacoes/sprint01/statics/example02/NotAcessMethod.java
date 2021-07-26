package br.com.apresentacoes.sprint01.statics.example02;

public class NotAcessMethod {
    public int number = 10;
/*
    public static int exibirNumber(){
        return number;      //It's not accessible, because number is not static.
    }
    */
}

/*
Rule:

Within static methods it is only possible to access other methods and variables that are also static.
Inside the method you can define any type of variable, static or not.
If you need to access some non-static method or member, you need to create an instance of the class and then call whatever you want.
The opposite is a little different: within non-static members, you can access both static and non-static properties.


 */