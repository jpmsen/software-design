package com.company;

public class FacebookPage {

    private Student student;

    public FacebookPage(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "My name is: " + this.student.getStudentName();
    }

}
