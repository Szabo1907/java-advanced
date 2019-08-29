package com.sda.paul.advanced.recapitulare.recap;


import java.util.List;

public class Student extends Person {

    private List<Integer> grades;


    public Student(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

}
