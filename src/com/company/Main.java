package com.company;

public class Main {

    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        // DEAR COLLEAGUE, PLEASE READ https://refactoring.guru/design-patterns/template-method
        // THANK ME LATER
        Card card = new HighSchoolGraduationCard(printer);

        card.print();
    }
}
