package com.company;

public class Student {
    private String studentName;
    private int studentId;
    private String studentCourse;
    private Boolean studentOnSchool;

    public Student(String name, int id, String course, Boolean onSchool) {
        this.studentName = name;
        this.studentId = id;
        this.studentCourse = course;
        this.studentOnSchool = onSchool;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Boolean getStudentOnSchool() {
        return studentOnSchool;
    }

    public void setStudentOnSchool(Boolean studentOnSchool) {
        this.studentOnSchool = studentOnSchool;
    }
}
