package com.company.ex_31__40;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
//        Пользователь вводит ненулевые целые числа до тех пор, пока не введет ноль.
//        Найдите количество четных чисел, которые он ввел.

        Scanner scan = new Scanner(System.in);


        int a;
        int count = 0;

        while (true) {
            System.out.println("Введите любое ненулевое число: ");
            System.out.println("Введите 0 для выхода из цикла");
            a = scan.nextInt();
            if (a == 0) break;
            if (a % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных введенных чисел: " + count);
    }
}
