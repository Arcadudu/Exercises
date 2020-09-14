package com.company.ex_21__30;

public class Ex21_summa {
    public static void main(String[] args) {

//        Найти сумму 10+11+12+13+...+88.
//        Ответ: 3871

        int a = 10;
        int sum = 0;

        for (; a <= 88; a++) {
            sum += a;

        }
        System.out.println(sum);


    }
}
