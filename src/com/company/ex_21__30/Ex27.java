package com.company.ex_21__30;

public class Ex27 {
    public static void main(String[] args) {
//        Вывести на экран числа от 1000 до 9999 такие, что среди цифр есть цифра 3.

        int number;
        for (number = 1000; number < 9999; number++) {
            String result = Integer.toString(number);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int d = Integer.parseInt(result.substring(3, 4));
            if (a == 3 || b == 3 || c == 3 || d == 3) {
                System.out.println(number);
            }
        }
    }
}
