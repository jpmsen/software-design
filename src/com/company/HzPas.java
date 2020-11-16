package com.company;

public class HzPas {
    private Student student;

    public HzPas(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Student name: " + this.student.getStudentName() + ". Student id: " + this.student.getStudentId();
    }
}