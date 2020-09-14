package com.company.ex_1__10;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
//        Дано четырехзначное число.
//        Верно ли, что цифр в нем расположены по убыванию?
//        Например, 4311 - нет, 4321 - да, 5542 - нет, 5631 - нет, 9871 - да.

        Scanner scan = new Scanner(System.in);
        String strNumber = scan.nextLine();
        int a = Integer.parseInt(strNumber.substring(0,1));
        int b = Integer.parseInt(strNumber.substring(1,2));
        int c = Integer.parseInt(strNumber.substring(2,3));
        int d = Integer.parseInt(strNumber.substring(3,4));

        if(a>b && b>c && c>d){
            System.out.println(a+""+b+""+c+""+d+" yes");

        } else {
            System.out.println(a+""+b+""+c+""+d+" no");

        }

    }
}
