package com.company.ex_1__10;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Дана дата из трех чисел (день, месяц и год).
//        Вывести yes, если такая дата существует
//        (например, 12 02 1999 - yes, 22 13 2001 - no).
//        Считать, что в феврале всегда 28 дней.


        int day;
        int month;
        int year;

        System.out.println("Enter the day");
        day = scan.nextInt();
        System.out.println("Enter the month");
        month = scan.nextInt();
        System.out.println("Enter the year");
        year = scan.nextInt();

        if (month == 2) {
            if ((day > 0 && day <= 28) && (year >= 1600 & year <= 3000)) {
                System.out.println(day + " " + month + " " + year + " yes");
            } else {
                System.out.println(day + " " + month + " " + year + " no");
            }
        } else {
            if ((day > 0 && day <= 30) && (year >= 1600 & year <= 3000)) {
                System.out.println(day + " " + month + " " + year + " yes");
            } else {
                System.out.println(day + " " + month + " " + year + " no");
            }


        }
    }
}
