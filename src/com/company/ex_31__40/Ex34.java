package com.company.ex_31__40;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
//        Выведите на экран строки вида:
//*******
//****
//*******
//****
//*******
//****
//(всего n строк, звездочек или 7, или 4 по очереди)

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        char star = '*';
        for (int i = 1; i <=(int) n/2 ; i++) {
            System.out.println("*******");
            for (int j = 1; j <=1 ; j++) {
                System.out.println("****");
            }
        }
        if(n%2==1){
            System.out.println("*******");
        }
    }
}
