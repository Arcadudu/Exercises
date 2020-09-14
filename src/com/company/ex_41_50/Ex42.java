package com.company.ex_41_50;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex42 {
    public static void main(String[] args) {
//        Сгенерировать случайную серию из 15 чисел, в которой ровно 3 единицы, остальные нули.

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <=12 ; i++) {
            numbers.add(0);
        }
        for (int i = 1; i <=3 ; i++) {
            numbers.add(1);
        }

        Collections.shuffle(numbers);
        for (int number : numbers) {
            System.out.print(number);
        }
    }
}
