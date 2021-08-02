package br.com.apresentacoes.sprint02.lombok.superbuilder;

public class Main {
    public static void main(String[] args) {

        // podemos fazer um construtor que possa ver as propriedades de seus ancestrais
        // anotamos nossa classe e seus ancestrais com a anotação @SuperBuilder

        var name = Student.builder()
                .childName("Giovane")
                .parentName("Solange")
                .schoolName("Pedro alvares cabral");

        System.out.println(name.build().getChildName());  // da classe child
        System.out.println(name.build().getParentName()); // da classe parent
        System.out.println(name.build().getSchoolName()); // da classe student

    }
}
