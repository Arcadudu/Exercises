package com.company.ex_21__30;

public class Ex26 {
    public static void main(String[] args) {
//        Вывести все пятизначные числа,
//        которые делятся на 2, у которых средняя цифра нечетная,
//        и сумма всех цифр делится на 4.
//        Материал сайта www.itmathrepetitor.ru

        int number;
        for (number = 10000; number < 99999; number++) {
            String result = Integer.toString(number);
            int a = Integer.parseInt(result.substring(0, 1));
            int b = Integer.parseInt(result.substring(1, 2));
            int c = Integer.parseInt(result.substring(2, 3));
            int d = Integer.parseInt(result.substring(3, 4));
            int e = Integer.parseInt(result.substring(4, 5));
            if (number % 2 == 0 && c % 2 != 0 && (a + b + c + d + e) % 4 == 0) {
                System.out.println(number);
            }
        }
    }
}
