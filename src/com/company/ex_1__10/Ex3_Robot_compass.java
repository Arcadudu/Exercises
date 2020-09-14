package com.company.ex_1__10;

import java.util.Scanner;

public class Ex3_Robot_compass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//       Робот может перемещаться в четырех направлениях
//       («0» — север, «1» — восток, «2» — юг , «3» — запад)
//       и принимать три цифровые команды:
//       0 — продолжать движение, -1 — поворот налево, 1 — поворот направо.
//       Дано число (0, 1, 2 или 3) — исходное направление робота
//       и целое число N (0, 1 или -1) — посланная ему команда.
//       Вывести направление робота после выполнения полученной команды
//       (то есть север, запад, юг или восток).

        String[] directions = {"north", "east", "south", "west"};
        System.out.println("Select direction");
        int d = scan.nextInt();
        System.out.println("Current direction: " + directions[d]);
        System.out.println();
        System.out.println("Enter command");
        int c = scan.nextInt();
        System.out.println();


        //keep going
        if (c == 0) {
            System.out.println("Moving forward");
            System.out.println("Current direction: " + directions[d]);
            // turn right
        } else if (c == 1 && d != 3) {
            d += 1;
            System.out.println("Turning right");
            System.out.println("Current direction: " + directions[d]);
        } else if (c == 1) {
            d = 0;
            System.out.println("Turning right");
            System.out.println("Current direction: " + directions[d]);
            // turn left
        } else if (c == -1 && d != 0) {
            d -= 1;
            System.out.println("Turning left");
            System.out.println("Current direction: " + directions[d]);
        } else if (c == -1) {
            d = 3;
            System.out.println("Turning left");
            System.out.println("Current direction: " + directions[d]);
        }


    }
}