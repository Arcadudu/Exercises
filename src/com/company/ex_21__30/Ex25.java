package com.company.ex_21__30;

public class Ex25 {
    public static void main(String[] args) {

//        Вывести на экран числа от 1000 до 9999 такие, что среди цифр нет цифр 5 и цифры 6.

        int start;

        for (start = 1000; start <= 9999; start++) {
            String result = Integer.toString(start);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int d = Integer.parseInt(result.substring(3, 4));
            if (a == 5 || a == 6 || b == 5 || b == 6 || c == 5 || c == 6 || d == 5 || d == 6) {

            } else {
                System.out.println(start);
            }
        }
    }
}
