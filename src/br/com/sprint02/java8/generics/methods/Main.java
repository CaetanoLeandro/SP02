package br.com.sprint02.java8.generics.methods;

public class Main {
    public static void main(String[] args) {
        DisplayArrays display = new DisplayArrays();

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"One", "Two", "Three"};
        Character[] charArray = {'A', 'B', 'C'};

        // display for each type of Array
        display.displayInteger(intArray);
        display.displayDouble(doubleArray);
        display.displayString(stringArray);
        display.displayChar(charArray);

        // display using Generics
        GenericDisplayArrays<Integer> i = new GenericDisplayArrays<>();
        i.display(intArray);

        GenericDisplayArrays<Double> d = new GenericDisplayArrays<>();
        d.display(doubleArray);

        GenericDisplayArrays<String> s = new GenericDisplayArrays<>();
        s.display(stringArray);

        GenericDisplayArrays<Character> c = new GenericDisplayArrays<>();
        c.display(charArray);


    }
}
