package br.com.sprint02.java8.lombok.constructor.superbuilder;

public class Main {
    public static void main(String[] args) {

        // diferente do builder, superbuilder suporta atributos de superclasses, tambem classes abstratas
        // se usar, tem que anotar na classe e nos seus ancestrais a anotação @SuperBuilder

        var name = Student.builder()
                .childName("Giovane")
                .parentName("Solange")
                .schoolName("Pedro alvares cabral");

        System.out.println(name.build().getChildName());  // da classe child
        System.out.println(name.build().getParentName()); // da classe parent
        System.out.println(name.build().getSchoolName()); // da classe student

    }
}
