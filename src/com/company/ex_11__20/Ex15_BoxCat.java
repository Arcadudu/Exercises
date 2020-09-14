package com.company.ex_11__20;

import java.util.Random;
import java.util.Scanner;

public class Ex15_BoxCat {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] catDeadAlive = {"жив. Повезло...", "мертв. Жаль..."};
            int randomResult = rand.nextInt(2);
            int choice;

            System.out.println();
            System.out.println("Открыть коробку: введите 1");
            System.out.println("Не открывать коробку: введите 0");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Вы открыли коробку. Кот " + catDeadAlive[randomResult]);
                    break;
                case 0:
                    System.out.println("Вы предпочли не открывать коробку...");
                    break;
            }

        }
    }
}
