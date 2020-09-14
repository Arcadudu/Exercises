package com.company.Hortsmann;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        Manager boss = new Manager("Carl Cracker", 80000, 1987,12,15);

        Employee[] staff = new Employee[3];

        staff[1] = boss;
        staff[2] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[0] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            e.setId();
            System.out.println("name: " + e.getName() +", Id: "+e.getId()+", salary: " + e.getSalary() + ", hire day: " + e.getHireDay());
        }



    }
}
