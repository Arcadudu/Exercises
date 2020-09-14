package com.company.ex_11__20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LocalDate date = LocalDate.now();

        int month = date.getMonthValue(); // определяем номер месяца даты
        int today = date.getDayOfMonth(); // определяем номер дня даты

        date = date.minusDays(today - 1); // вычитаем из полученной даты ее саму, за вычитом единицы, чтобы получить
        // первое число месяца. например 9 - (9-1) = 1.

        DayOfWeek weekday = date.getDayOfWeek(); // определяем день недели для заданной даты и переносим его
        // в переменную weekday
        int value = weekday.getValue(); // с помощью getValue получаем числовое значение для дня недели


        System.out.println("ПНД ВТР СРД ЧТВ ПТЦ СБТ ВСК"); // заголовок календаря
        for (int i = 1; i < value; i++) {
            System.out.print(" ");
        }
            while (date.getMonthValue() == month) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfMonth() == today) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                }
            }
    }
}


