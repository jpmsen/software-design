package com.company;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.name = schoolName;
        this.students = new ArrayList<Student>();
    }

    public void entrance(Student student) {
        this.students.add(student);
    }

    public String listStudentsPasses() {
        StringBuilder strBuilder = new StringBuilder();
        for (Student student : this.students) {
            HzPas hzPas = new HzPas(student);

            strBuilder.append(hzPas.toString());
        }

        return strBuilder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
