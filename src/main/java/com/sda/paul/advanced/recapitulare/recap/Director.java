package com.sda.paul.advanced.recapitulare.recap;

public class Director extends Professor {
    public Director() {
    }

    public Director(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender, salary, subject);
    }

    public Director(double salary, String subject) {
        super(salary, subject);
    }

}
