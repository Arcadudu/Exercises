package com.company.ex_1__10;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
//        Дано трехзначное число.
//        Переставьте первую и последнюю цифры.
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int first = Integer.parseInt(str.substring(0,1));
        int last = Integer.parseInt(str.substring(2,3));
        String str1 = last+str.substring(1,2)+first;
        System.out.println(str1);
    }
}
