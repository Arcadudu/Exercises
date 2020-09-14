package com.company.ex_1__10;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Дано две даты, каждая из которых состоит
//        из трех чисел (день, месяц и год).
//        Вывести yes, если первая дата раньше второй,
//        иначе вывести no.

        Scanner scan = new Scanner(System.in);

        int aDay = scan.nextInt();
        int aMonth = scan.nextInt();
        int aYear = scan.nextInt();

        int bDay = scan.nextInt();
        int bMonth = scan.nextInt();
        int bYear = scan.nextInt();

        System.out.println("Dates:");
        System.out.println(aDay+" "+aMonth+" "+aYear);
        System.out.println(bDay+" "+bMonth+" "+bYear);

        if ((aYear < bYear)
                || (aYear == bYear && aMonth < bMonth)
                || (aYear == bYear && aMonth == bMonth && aDay < bDay) ){
            System.out.println();
            System.out.println("yes");
        } else {
            System.out.println();
            System.out.println("no");
        }
    }
}
