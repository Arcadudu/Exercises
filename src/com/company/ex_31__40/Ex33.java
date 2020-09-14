package com.company.ex_31__40;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
//  Выведите  на экран строки (в последней строке n звездочек):
//  *
//  **
//  ***
//  ****
//  *****
        Scanner scan = new Scanner(System.in);

        char star = '*';
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
