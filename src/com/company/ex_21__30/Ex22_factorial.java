package com.company.ex_21__30;

public class Ex22_factorial {
    public static void main(String[] args) {

//        Найти произведение 5⋅6⋅7⋅...⋅13

        int a = 5;
        int fact = 1;

        for (;  a<=13 ; a++) {
            fact *=a;
        }
        System.out.println(fact);
    }
}
