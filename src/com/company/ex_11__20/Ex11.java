package com.company.ex_11__20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader
                ("C:\\Users\\Arcadudu\\IdeaProjects\\Exercises\\src\\com\\company\\vagons\\VagNum");
        Scanner scan = new Scanner(fr);

        int wagonNumber;

        while (scan.hasNextInt()) { //58573155
            wagonNumber = scan.nextInt();

            if ((wagonNumber >= 58570037 && wagonNumber <= 58572835)
                    || (wagonNumber >= 58573247 && wagonNumber <= 58573445)) {
                System.out.println(wagonNumber + " - РХМ");
            } else if ((wagonNumber >= 58572918 && wagonNumber <= 58573197)
                    || wagonNumber == 58573494) {
                System.out.println(wagonNumber + " - Понижайка");
            } else if (wagonNumber >= 58670000) {
                System.out.println(wagonNumber + " - Сетка");
            } else {
                System.out.println(wagonNumber+" - !!Ошибка ввода!!");
            }
        }
    }
}
