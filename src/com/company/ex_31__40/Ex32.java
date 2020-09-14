package com.company.ex_31__40;

public class Ex32 {
    public static void main(String[] args) {
//        Вывести ряд чисел:
//        десять десяток, девять девяток, восемь восьмерок, ... , одну единицу.
//        Найти сумму всех этих чисел.

        int a10 = 10, a9 = 9, a8 = 8, a7 = 7, a6 = 6, a5 = 5, a4 = 4, a3 = 3, a2 = 2, a1 = 1;
        int sum = 0;

        for (int i = 1; i <= a10; i++) {
            System.out.print(a10);
            sum += a10;
        }
        for (int i = 1; i <= a9; i++) {
            System.out.print(a9);
            sum += a9;
        }
        for (int i = 1; i <= a8; i++) {
            System.out.print(a8);
            sum += a8;
        }
        for (int i = 1; i <= a7; i++) {
            System.out.print(a7);
            sum += a7;
        }
        for (int i = 1; i <= a6; i++) {
            System.out.print(a6);
            sum += a6;
        }
        for (int i = 1; i <= a5; i++) {
            System.out.print(a5);
            sum += a5;
        }
        for (int i = 1; i <= a4; i++) {
            System.out.print(a4);
            sum += a4;
        }
        for (int i = 1; i <= a3; i++) {
            System.out.print(a3);
            sum += a3;
        }
        for (int i = 1; i <= a2; i++) {
            System.out.print(a2);
            sum += a2;
        }
        for (int i = 1; i <= a1; i++) {
            System.out.print(a1);
            sum += a1;
        }
        System.out.println();
        System.out.println(sum);
    }
}
