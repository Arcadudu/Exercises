package com.company.ex_21__30;

public class Ex28 {
    public static void main(String[] args) {
//        Найдите трехзначные числа, равные сумме кубов своих цифр.

        int number;

        for (number = 100; number < 999; number++) {
            String result = Integer.toString(number);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int cubeSum = (a * a * a) + (b * b * b) + (c * c * c);
            if (number == cubeSum) {
                System.out.println(number);
            }


        }
    }
}
