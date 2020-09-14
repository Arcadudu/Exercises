package com.company.ex_21__30;

public class Ex24 {
    public static void main(String[] args) {
// Вывести на экран числа от 1000 до 9999 такие, что все цифры различны

        int start;
        for (start = 1000; start < 9999; start++) {
            String result = Integer.toString(start);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int d = Integer.parseInt(result.substring(3, 4));
            if (a == b || a == c || a == d || b == c || b == d || c == d) {
            } else {
                System.out.println(start);
            }
        }


    }
}
