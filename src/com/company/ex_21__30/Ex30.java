package com.company.ex_21__30;

public class Ex30 {
    public static void main(String[] args) {

// Найдите хотя одно натуральное число,
// которое делится на 11,
// а при делении на 2, 3, 4, ..., 10 дает в остатке 1

        int number;

        for (number = 1; number <= 100000; number++) {
            if (number % 11 == 0 && number % 3 == 1 && number % 6 == 1 && number % 7 == 1 &&
                    number % 8 == 1 && number % 9 == 1 && number % 10 == 1) {
                System.out.println(number);
            }
        }

    }
}
