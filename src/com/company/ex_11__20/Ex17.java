package com.company.ex_11__20;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

//        Даны целочисленные координаты трех вершин прямоугольника,
//        стороны которого параллельны координатным осям.
//        Найдите координаты его четвертой вершины
//        (после проверки введенных данных на правильность).
        Scanner scan = new Scanner(System.in);

        char[][] space = new char[41][41];

        System.out.println("Укажите координаты вершин прямоугольника: ");

        int xA = scan.nextInt();
        int yA = scan.nextInt();
        System.out.println("{" + xA + ";" + yA + "} - вершина А");

        int xB = scan.nextInt();
        int yB = scan.nextInt();
        System.out.println("{" + xB + ";" + yB + "} - вершина В");

        int xC = scan.nextInt();
        int yC = scan.nextInt();
        System.out.println("{" + xC + ";" + yC + "} - вершина С");

        System.out.println("'''''''''''''''''''''''''''''");

        int xD = 0;
        int yD = 0;

        // правильность :
        // xA=xC ; xB = xD; yC = yD; yA =yB


        if (xA == xC && yA == yB) {
            xD = xB;
            yD = yC;
            System.out.println("Координаты четвертой вершины прямоугольника: {" + xD + ";" + yD + "}");
        } else if (xA == xB && yA == yC) {
            xD = xC;
            yD = yB;
            System.out.println("Координаты четвертой вершины прямоугольника: {" + xD + ";" + yD + "}");
        } else if (xA == xB && yB == yC) {
            xD = xC;
            yD = xA;
            System.out.println("Координаты четвертой вершины прямоугольника: {" + xD + ";" + yD + "}");
        } else {
            System.out.println("Неверно указаны координаты");
        }

        int xA1 = xA + 20;
        int yA1 = (yA - 20) * -1;

        int xB1 = xB + 20;
        int yB1 = (yB - 20) * -1;

        int xC1 = xC + 20;
        int yC1 = (yC - 20) * -1;

        int xD1 = xD + 20;
        int yD1 = (yD - 20) * -1;


        for (int y = 0; y < space.length; y++) {
            for (int x = 0; x < space[y].length; x++) {
                if (y == 20) {
                    space[y][x] = '—';
                }
                if (x == 20) {
                    space[y][x] = '|';
                }
                if (y == 20 && x == 20) {
                    space[y][x] = '0';
                }
                if (y == yA1 && x == xA1) {
                    space[y][x] = 'A';
                }
                if (y == yB1 && x == xB1) {
                    space[y][x] = 'B';
                }
                if (y == yC1 && x == xC1) {
                    space[y][x] = 'C';
                }
                if (y == yD1 && x == xD1) {
                    space[y][x] = 'D';
                }

                if (xA1 == xC1 && yA1 == yB1 && xA1 < xB1) {
                    if ((y < yD1 && y > yB1 && (x == xB1 || x == xA1)) || (x > xA1 && x < xB1 && (y == yA1 || y == yC1))) {
                        space[y][x] = 'x';
                    }
                } else if (xA1 == xC1 && yA1 == yB1 && xA1 > xB1) {
                    if ((y < yA1 && y > yC1 && (x == xA1 || x == xB1)) || (x < xA1 && x > xB1 && (y == yA1 || y == yD1))) {
                        space[y][x] = 'x';
                    }
                } else if (xA1 == xB1 && yA1 == yC1 && yA1 < yB1) {
                    if ((y > yA1 && y < yB1 && (x == xA1 || x == xC1)) || (x > xC1 && x < xA1 && (y == yA1 || y == yB1))) {
                        space[y][x] = 'x';
                    }
                } else if (xA1 == xB1 && yA1 == yC1 && yA1 > yB1) {
                    if ((y < yA1 && y > yB1 && (x == xA1 || x == xC1)) || (x > xA1 && x < xC1 && (y == yA1 || y == yB1))) {
                        space[y][x] = 'x';
                    }
                }
                    System.out.print(space[y][x] + "  ");
                }
                System.out.println();
            }


        }
    }

