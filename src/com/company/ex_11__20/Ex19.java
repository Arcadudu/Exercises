package com.company.ex_11__20;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

//        Даны два прямоугольника, стороны которых параллельны или перпендикулярны осям координат.
//        Известны координаты левого нижнего угла каждого из них и длины их сторон.
//        Один из прямоугольников назовем первым, другой — вторым.
//        Найти координаты левого нижнего и правого верхнего углов минимального прямоугольника,
//        содержащего указанные прямоугольники.
    Scanner scan = new Scanner(System.in);

        int xA2 ;
        int yA2 ;
        int xB2 ;
        int yB2 ;
        int xC1 = 0;
        int yC1 = 0;
        int xC2 = 0;
        int yC2 = 0;

        System.out.println("Укажите координаты первой точки: ");
        int xA1 = scan.nextInt();
        int yA1 = scan.nextInt();
        System.out.println("Укажите координаты второй точки: ");
        int xB1 = scan.nextInt();
        int yB1 = scan.nextInt();
        System.out.println("Укажите длину стороны a: ");
        int a = scan.nextInt();
        System.out.println("Укажите длину стороны b: ");
        int b = scan.nextInt();

        xA2 = xA1 + a;
        yA2 = yA1 + b;
        xB2 = xB1 + a;
        yB2 = yB1 + b;
        if (xA1 < xB1 && (yA1 < yB1 || yA1 == yB1)) {
            xC1 = xA1;
            yC1 = yA1;
            xC2 = xB2;
            yC2 = yB2;
        } else if (xA1 < xB1) {
            xC1 = xA1;
            yC1 = yB1;
            xC2 = xB2;
            yC2 = yA2;
        } else if (xA1 > xB1 && (yA1 > yB1 || yA1 == yB1)) {
            xC1 = xB1;
            yC1 = yB1;
            xC2 = xA2;
            yC2 = yA2;
        } else if (xA1 > xB1) {
            xC1 = xB1;
            yC1 = yA1;
            xC2 = xA2;
            yC2 = yB2;
        } else if (xA1 == xB1 && yA1 > yB1) {
            xC1 = xB1;
            yC1 = yB1;
            xC2 = xA2;
            yC2 = yA2;
        } else if (xA1 == xB1 && yA1 < yB1) {
            xC1 = xA1;
            yC1 = yA1;
            xC2 = xB2;
            yC2 = yB2;
        } else if (xA1 == xB1 && yA1 == yB1) {
            xC1 = xA1;
            yC1 = yA1;
            xC2 = xB2;
            yC2 = yB2;
        } else {
            System.out.println("Ошибка вычислений");
        }

        System.out.println("координата нижней левой вершины общего прямоугольника: ");
        System.out.println("[" + xC1 + ":" + yC1 + "]");
        System.out.println("координата верхней правой вершины общего прямоугольника: ");
        System.out.println("[" + xC2 + ":" + yC2 + "]");
        }





}
