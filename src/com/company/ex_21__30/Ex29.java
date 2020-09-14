package com.company.ex_21__30;

public class Ex29 {
    public static void main(String[] args) {
//        Сколько существует четырехзначных чисел, которые в 600 раз больше суммы своих цифр?

        int number;

        for (number = 1000; number < 9999; number++) {
            String result = Integer.toString(number);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int d = Integer.parseInt(result.substring(3, 4));
            int sum = a + b + c + d;
            if (number / sum == 600) {
                System.out.println(number);
            }
        }
    }
}
