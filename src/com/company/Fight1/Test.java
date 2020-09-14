package com.company.Fight1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Player player1 = new Player("Шевчук", 1);
        Computer computer1 = new Computer("Верзила", 1);


        while (true) {
            player1.getHit(computer1);
            if (player1.getHp() <= 0 || computer1.getHp() <= 0) break;
            computer1.getHit(player1);
            if (player1.getHp() <= 0 || computer1.getHp() <= 0) break;
        }
        if (player1.getHp() > computer1.getHp()) {
            System.out.println();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(player1.getName() + " победил!");
        } else {
            System.out.println(computer1.getName() + " победил!");

        }
    }


}
