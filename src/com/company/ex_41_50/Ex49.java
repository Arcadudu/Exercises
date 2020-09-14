package com.company.ex_41_50;

import java.util.Arrays;
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
// //      Пользователь вводит положительное целое число.
//         Зашифровать каждую цифру серией из букв
//         (конкретный принцип составления серии букв разработать самостоятельно).


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String intoString = input + "";
        int[] array = new int[intoString.length()];

        for (int i = 0; i < intoString.length(); i++) {
            array[i] = Integer.parseInt(intoString.substring(i, i+1));
        }

        for(int num : array){
            if(num == 1) System.out.print("коричневый ");
            if(num == 2) System.out.print("красный ");
            if(num == 3) System.out.print("оранжевый ");
            if(num == 4) System.out.print("желтый ");
            if(num == 5) System.out.print("зеленый ");
            if(num == 6) System.out.print("голубой ");
            if(num == 7) System.out.print("синий ");
            if(num == 8) System.out.print("фиолетовый ");
            if(num == 9) System.out.print("чёрный ");
            if(num == 0) System.out.print("белый ");

        }

    }
}
