package br.com.apresentacoes.sprint01.statics.exercise3;

public class StaticTemporaria {
        public static int contador_static = 0;
        public int contador_normal = 0;

        public StaticTemporaria() {}

        public static void incrementaStatic(){
            contador_static++;
            System.out.println("Contador STATIC agora é = " + contador_static);
        }
        public void incrementaContador() {
            contador_normal++;
            System.out.println("Contador NORMAL agora é = "+ contador_normal);
        }
    }

class Main{
    public static void main(String args[])
    {
        System.out.println("\n1ª Instância -----");
        StaticTemporaria s1 = new StaticTemporaria();
        s1.incrementaStatic();
        s1.incrementaContador();

        System.out.println("\n2ª Instância -----");
        StaticTemporaria s2 = new StaticTemporaria();
        s2.incrementaStatic();
        s2.incrementaContador();

        System.out.println("\n3ª Instância -----");
        StaticTemporaria s3 = new StaticTemporaria();
        s3.incrementaStatic();
        s3.incrementaContador();

        System.out.println("\n4ª Instância -----");
        StaticTemporaria s4 = new StaticTemporaria();
        s4.incrementaStatic();
        s4.incrementaContador();
    }
}

/*
Note that the “contador_static” attribute, which is static, has not been reset to zero
for each new object created from the StaticTemporaria class, but incremented,
while "contador_normal", which is a common attribute, was always set to 1, because
we reset the value in the class's constructor.
 */