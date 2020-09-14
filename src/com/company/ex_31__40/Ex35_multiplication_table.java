package com.company.ex_31__40;

public class Ex35_multiplication_table {
    public static void main(String[] args) {
//        Выведите на экран таблицу умножения для чисел от 1 до 10.

        int[][] table = new int[10][10];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                table[i][j] = i * j;
                if (table[i][j] < 10) {
                    System.out.print(table[i][j] + "  ");
                } else {
                    System.out.print(table[i][j] + " ");
                }
            }
            System.out.println("   ");
        }
    }
}
