package com.company.ex_41_50;

import java.util.Scanner;

public class Ex43 {
//   Компьютер загадывает число от 1 до 100.
//   У пользователя три попытки отгадать.
//   После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = 6;

        int secretNumber = (int) (Math.random() * 100 + 1);

        while (round != 0) {

            int attempt = scanner.nextInt();
            round--;
            if (attempt == secretNumber) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (attempt > secretNumber) {
                System.out.println("Загаданное число меньше указанного.\nОсталось попыток: " + round);
            } else {
                System.out.println("Загаданное число больше указанного.\nОсталось попыток: " + round);
            }
        }
    }
}