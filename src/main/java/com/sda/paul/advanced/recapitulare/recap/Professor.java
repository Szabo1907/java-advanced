package com.sda.paul.advanced.recapitulare.recap;

public class Professor  extends Person implements Payable{

    private double salary;
    private String subject;

    public Professor() {
    }

    public Professor(int age, String name, Gender gender, double salary, String subject) {
        super(age, name, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public Professor(double salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    public void pay(double amount) {

    }
}
