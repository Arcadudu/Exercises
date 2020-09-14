package com.company.ex_31__40;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
//        Найдите все натуральные числа, не превосходящие 10000,
//        сумма цифр каждого из которых в некоторой степени равна самому числу.

        Scanner scan = new Scanner(System.in);

        int number;

        while (true) {

            int power = scan.nextInt();

            for (number = 1; number <= 10000; number++) {

                if (number < 10) {
                    String str = Integer.toString(number);
                    int a = Integer.parseInt(str.substring(0, 1));
                    int powered = (int) Math.pow(a, power);
                    if (number == powered) System.out.println(number);

                } else if (number < 100) {
                    String str = Integer.toString(number);
                    int a = Integer.parseInt(str.substring(0, 1));
                    int b = Integer.parseInt(str.substring(1, 2));
                    int powered = (int) Math.pow((a + b), power);
                    if (number == powered) System.out.println(number);

                } else if (number < 1000) {
                    String str = Integer.toString(number);
                    int a = Integer.parseInt(str.substring(0, 1));
                    int b = Integer.parseInt(str.substring(1, 2));
                    int c = Integer.parseInt(str.substring(2, 3));
                    int powered = (int) Math.pow((a + b + c), power);
                    if (number == powered) System.out.println(number);

                } else if (number < 10000) {
                    String str = Integer.toString(number);
                    int a = Integer.parseInt(str.substring(0, 1));
                    int b = Integer.parseInt(str.substring(1, 2));
                    int c = Integer.parseInt(str.substring(2, 3));
                    int d = Integer.parseInt(str.substring(3, 4));
                    int powered = (int) Math.pow((a + b + c + d), power);
                    if (number == powered) System.out.println(number);
                }
            }

        }
    }
}
