package com.company.ex_31__40;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {

//        Найдите, сколько точек с целочисленными координатами попадает в круг радиуса r  с центром в точке (x,y).
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(); // радиус
        int sqr = (int) (Math.PI * r * r); // площадь круга
        double er = r * 0.6298; // поправка
        int quantity = (int) (sqr + er); // количество точек
        System.out.println("Площадь круга: "+sqr); //
        System.out.println("Количество точек круга "+quantity);

    }
}
