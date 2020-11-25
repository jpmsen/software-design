package com.company;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Console console = new Console();

        console.print("Welkom bij deze game");

        console.print("Het is nu 06.00u");

        Student student1 = new Student("Jeffrey", 12345, "SDE", false);
        Student student2 = new Student("Flavio", 21345, "SDE", false);

        Student[] students = {student1, student2};
        School school = new School("Hogeschool Zeeland");

        console.print("Er lopen twee " + students.length + " student(en) in de school. Dit zijn:");
        for (Student student : students) {
            school.entrance(student);
            console.print(student.getStudentName());
        }

        console.print("De schoolpassen worden gecontroleerd van deze student(en)");
        console.print(school.listStudentsPasses());



    }
}
