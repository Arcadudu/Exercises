package com.company.ex_41_50;

import java.util.Scanner;

public class Ex41_Bricks {
    public static void main(String[] args) {

        System.out.println("Укажите общее количество кирпичей: ");
        Scanner scanner = new Scanner(System.in);
        int bricksNumber = scanner.nextInt();


        go:
        for (; bricksNumber > 0; ) {
            System.out.println("Сколько кирпичей убрать:    1  2  3");
            int choice = scanner.nextInt();
            if (choice > 3 || choice <= 0) {
                System.out.println("Ошибка ввода, повторите попытку: ");
                continue go;
            }
            System.out.println("Убрали кирпичей: " + choice);
            bricksNumber -= choice;
            System.out.println("Осталось кирпичей: " + bricksNumber + "\n");
            if (bricksNumber <= 0) {
                System.out.println("Вы победили ");
                break;
            }
            int compChoice;
            if (bricksNumber == 3 || bricksNumber == 2 || bricksNumber == 1) {
                compChoice = bricksNumber;
                System.out.println("Компьютер убрал кирпичей: " + compChoice);
                System.out.println("Компьютер победил");
                break;

            } else {
                compChoice = (int) (Math.random() * 3) + 1;
                if (bricksNumber - compChoice < 5 && compChoice == 3) {
                    if (bricksNumber - compChoice == 4) {
                        compChoice -= 1;
                    } else if (bricksNumber - compChoice == 3) {
                        compChoice -= 2;
                    }
                }
                System.out.println("Компьютер убрал кирпичей: " + compChoice);
            }
            bricksNumber -= compChoice;

            System.out.println("Осталось кирпичей: " + bricksNumber + "\n");
        }

    }
}
