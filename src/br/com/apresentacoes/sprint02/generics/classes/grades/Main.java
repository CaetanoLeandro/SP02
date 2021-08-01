package br.com.apresentacoes.sprint02.generics.classes.grades;

public class Main {
    public static void main(String[] args) {
        HomeWorkGrade shaneHomeWork = new HomeWorkGrade("Shane", "HomeWork A");
        shaneHomeWork.setGrade(6.4);

        TestGrade shaneTest = new TestGrade("Shane", "Math Test 2");
        shaneTest.setGrade(8.9);

        GradeBook<TestGrade> testGradeBook = new GradeBook<>();
        GradeBook<HomeWorkGrade> homeWorkGradeGrade = new GradeBook<>();

        // se colocar shaneHomeWork em testGradeBook da erro de compilacao
        testGradeBook.addGrades(shaneTest);
        homeWorkGradeGrade.addGrades(shaneHomeWork);

        System.out.println(shaneHomeWork.getGrade());

    }
}
