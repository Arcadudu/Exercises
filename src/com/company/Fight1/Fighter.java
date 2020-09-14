package com.company.Fight1;

import java.util.Random;
import java.util.Scanner;

public abstract class Fighter {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    /////////////////// ПОЛЯ ///////////////////
    private final String name;
    private int hp;
    private int hpDMG;
    private int totalDMG;
    private int st, stDMG, stHitCost;
    private int stBlockBonus;
    private static int round = 0;
    private int level;


    /////////////////// КОНСТРУКТОР ///////////////////
    public Fighter(String name, int level) {
        this.name = name;
        this.level = level;
        hp = 100;
        st = 100;
    }


    /////////////////// ГЕТТЕРЫ ///////////////////
    public String getName() {
        return name;
    }

    public int getSt() {
        return st;
    }

    public int getHp() {
        return this.hp;
    }


    /////////////////// РАНДОМЫ ///////////////////
    public int getHpExtraDMG() {
        return random.nextInt(9);
    }

    public int get_Floor_HpExtraDMG() {
        return random.nextInt(14);
    }

    public boolean getChance() {
        boolean[] ch = {true, false, false};
        int i = random.nextInt(3);
        return ch[i];
    }


    /////////////////// УДАРЫ ///////////////////
    public void headHit(Fighter other) {
        stHitCost = 20;
        this.st -= stHitCost;

        if (other.getBlock(other) != 1) {

            //Успешный удар по голове
            hpDMG = 20;
            totalDMG = hpDMG + getHpExtraDMG();
            other.hp -= totalDMG;
            if (other.hp < 0) {
                other.hp = 0;
            }


            stDMG = 8;
            other.st -= stDMG;

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости и проводит удар в голову,\n" +
                            "* нанося " + other.name + " " + totalDMG + " урона здоровью и " + stDMG + " урона выносливости.\n");

        } else {
            // заблокированный удар по голове
            stBlockBonus = 15;

            other.st += stBlockBonus;
            if (other.st >= 100) {
                other.st = 100;
            }

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости на удар в голову,\n" +
                            "* но " + other.name + " успевает вовремя поставить верхний блок.\n");

        }
        if (other.st < 0) other.st = 0;
        if (this.st < 0) this.st = 0;
        hud(other);
    }

    public void bodyHit(Fighter other) {

        stHitCost = 15;
        this.st -= stHitCost;

        if (other.getBlock(other) != 2) {

            // Успешный удар по корпусу
            hpDMG = 15;
            totalDMG = hpDMG + getHpExtraDMG();
            other.hp -= totalDMG;
            if (other.hp < 0) {
                other.hp = 0;
            }

            stDMG = 5;
            other.st -= stDMG;

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости и проводит удар в корпус,\n" +
                            "* нанося " + other.name + " " + totalDMG + " урона здоровью и " + stDMG + " урона выносливости.\n");
        } else {
            // заблокированный удар по корпусу
            stBlockBonus = 10;

            other.st += stBlockBonus;
            if (other.st >= 100) {
                other.st = 100;
            }

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости на удар в корпус,\n" +
                            "* но " + other.name + " успевает вовремя поставить средний блок.\n");
        }
        if (other.st < 0) other.st = 0;
        if (this.st < 0) this.st = 0;
        hud(other);
    }

    public void legHit(Fighter other) {

        stHitCost = 40;
        this.st -= stHitCost;

        if (other.getBlock(other) != 3) {

            // Успешный удар по ногам
            hpDMG = 25;
            other.hp -= hpDMG;
            if (other.hp < 0) {
                other.hp = 0;
            }

            stDMG = 5;
            other.st -= stDMG;

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости и проводит подсечку,\n" +
                            "* нанося " + other.name + " " + hpDMG + " урона здоровью и " + stDMG + " урона выносливости.");
            System.out.print("(!) " + other.name + " падает на землю");

            if (this.getSt() >= 10) {
                if (getChance()) // если есть шанс добить:
                {
                    System.out.print("...");
                    floorHit(other);

                } else { // нет шанса добить:
                    System.out.print(", но быстро встает на ноги.\n\n");

                }
            } else {
                System.out.println("\n" + "* " + "На добивание у " + this.name + " не хватает выносливости");
            }

        } else {
            stBlockBonus = 20;

            other.st += stBlockBonus;
            if (other.st >= 100) {
                other.st = 100;
            }

            System.out.println
                    ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости на подсечку,\n" +
                            "* но " + other.name + " успевает вовремя поставить нижний блок.\n");
        }
        if (other.st < 0) other.st = 0;
        if (this.st < 0) this.st = 0;
        hud(other);
    }

    public void floorHit(Fighter other) {
        stHitCost = 10;
        this.st -= stHitCost;

        hpDMG = get_Floor_HpExtraDMG();
        other.hp -= hpDMG;
        if (other.hp < 0) {
            other.hp = 0;
        }

        stDMG = 5;
        other.st -= stDMG;

        System.out.println
                ("\n" + "* " + this.name + " тратит " + this.stHitCost + " очков выносливости и проводит добивание,\n" +
                        "* нанося " + other.name + " " + hpDMG + " урона здоровью и " + stDMG + " урона выносливости.\n");


    }


    /////////////////// РАЗНОЕ ///////////////////
    public abstract void getHit(Fighter other);

    public abstract int getBlock(Fighter other);

    public void raiseST(int raise) {
        this.st += raise;
    }

    public void hud(Fighter other) {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.name + " | Здоровье: " + this.hp + "  Стамина: " + this.st);
        System.out.println(other.name + " | Здоровье: " + other.hp + "  Стамина: " + other.st);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

    }


}





