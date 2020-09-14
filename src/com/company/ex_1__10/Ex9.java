package com.company.ex_1__10;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Дано четырехзначное число.
//        Переставьте местами цифры так,
//        чтобы сначала оказались цифры, меньшие пяти.
        Scanner scan = new Scanner(System.in);

        String str0 = scan.nextLine();
        int a = Integer.parseInt(str0.substring(0, 1));
        int b = Integer.parseInt(str0.substring(1, 2));
        int c = Integer.parseInt(str0.substring(2, 3));
        int d = Integer.parseInt(str0.substring(3, 4));

        int[] array = {a, b, c, d};
        boolean isSorted = false;

        for (int l = 0; l < 4; l++) {
            for (int i = 1; i < array.length; i++) {
                int temp = 0;
                if (array[i] < 5) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }

        }
        for (int e :array){
            System.out.print(e);
        }


    }
}

