package br.com.apresentacoes.sprint02.java8.generics.classes.grades;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HomeWorkGrade extends Grade {
    private String studentName;
    private String homeWorkName;

}
