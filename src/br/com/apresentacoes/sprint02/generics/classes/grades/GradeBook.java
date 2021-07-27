package br.com.apresentacoes.sprint02.generics.classes.grades;

import java.util.ArrayList;
import java.util.List;

public class GradeBook<T> {
    List<T> grades = new ArrayList<>();

    // utilizando Generics em Method
    public void addGrades(T grade){
        grades.add(grade);
    }

}
