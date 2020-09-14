package com.company.Hortsmann;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    private static int nextId = 1;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        if(name == null){
            name = "unknown";
        }
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
        id = 0;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId(){
        return nextId;
    }

    public void raiseSalary(double byPercent){
        double raise = salary *byPercent /100;
        salary += raise;
    }
}
