package com.company.LootingLockers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Loot {
    Random rand = new Random();


    private String [] lootListArray =
            {"Червивое яблоко","Сломанный карандаш","USB-зарядка","Книга Пелевина",
             "Исписанная тетрадка", "Световой меч", "Пачка чипсов","Пластилиновая ворона ",
             "Учебник по выживанию","Набор для покера", "Кусочек ржавчины", "Мантия-невидимка"};



    private String lootResult = lootListArray[rand.nextInt(lootListArray.length)];

    public String getLootResult() {
        return lootResult;
    }

    public void getLoot (Locker locker) {
        if (locker.isLockerClosed()) {
            System.out.println("Шкафчик закрыт. Невозможно понять, что лежит внутри");
        } else if (!locker.isLockerClosed()) {
            System.out.println("В шкафчике " + locker.getLockerName() + " лежит: " + getLootResult());
            lootResult = lootListArray[rand.nextInt(lootListArray.length)];

        }
    }




}
