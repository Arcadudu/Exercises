package com.company.ex_41_50;

import java.util.Scanner;

// Пользователь вводит англ. букву, вывести следующие три по алфавиту.
// Если алфавит закончился, то вывести циклично с начала алфавита,
// то есть если z, то a b c.
// Вывод только маленьких букв. Учесть, что пользователь может ввести заглавную
public class Ex46 {
    public static void main(String[] args) {

        //codePointAt(int index); - возвращает кодовую точку, начало или конец которой находится на указанной позиции
        //        str.codePointAt(4);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String req = scanner.next();
            String temp = req.toLowerCase();
            char zeroChar = (char) temp.codePointAt(0);
                if(zeroChar == '0') break;
            char first = (char) (zeroChar + 1);
            char second = (char) (zeroChar + 2);
            char third = (char) (zeroChar + 3);
            if (zeroChar == 'z') {
                first = 'a';
                second = 'b';
                third = 'c';
            } else if (zeroChar == 'y') {
                second = 'a';
                third = 'b';
            } else if (zeroChar == 'x') {
                third = 'a';
            }
            System.out.println(first + " " + second + " " + third);


        }
    }
}
