package com.company.ex_1__10;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
//        Дано пятизначное число.
//        Цифры на четных позициях занулить.
//        Например, из 12345 получается число 10305.

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int second = Integer.parseInt(str.substring(1,2));
        int third = Integer.parseInt(str.substring(3,4));

        second =0;
        third =0;
        System.out.println(str.substring(0,1)+second+str.substring(2,3)+third+str.substring(4,5));


    }
}
