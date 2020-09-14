package com.company.ex_11__20;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
//        Даны два трехзначных числа.
//        Получите новое число присоединением второго числа справа к первому
//        без последних цифр у каждого.
//        Например, 123 и 456 Ответ: 1245
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = (a /10)*100 + (b/10);


        System.out.println(c);

    }
}
