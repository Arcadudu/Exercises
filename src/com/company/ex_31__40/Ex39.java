package com.company.ex_31__40;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {

//          Дано число sum. Определите, существует ли такое число number, что 1+2+3+...+number = sum.
        Scanner scan = new Scanner(System.in);

        int sum = scan.nextInt();
        int number = 0;
        int temp = 0;

        for(; ;){
            number++;
            temp += number;
            System.out.println(number+"  "+temp);
            if(temp == sum) break;
        }
        System.out.println(number);
    }
}
