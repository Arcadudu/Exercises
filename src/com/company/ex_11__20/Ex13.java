package com.company.ex_11__20;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
//        Дано четырехзначное число.
//        Поменяйте местами наименьшую и наибольшую цифры
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int a = Integer.parseInt(str.substring(0, 1));
        int b = Integer.parseInt(str.substring(1, 2));
        int c = Integer.parseInt(str.substring(2, 3));
        int d = Integer.parseInt(str.substring(3, 4));


        int[] numbers = {a, b, c, d};
        int min = numbers[0];
        int minInd = 0;
        int max = numbers[0];
        int maxInd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
                minInd = i;
            }
            if (max < numbers[i]) {
                max = numbers[i];
                maxInd = i;
            }
        }
        numbers[minInd] = max;
        numbers[maxInd] = min;

        for (int number : numbers){
            System.out.print(number);

        }




    }
}
