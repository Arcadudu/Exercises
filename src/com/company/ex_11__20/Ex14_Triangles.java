package com.company.ex_11__20;

import java.util.Scanner;

public class Ex14_Triangles {
    public static void main(String[] args) {

//        Пользователь вводит три числа - длины сторон треугольника.
//        Найти площадь треугольника.
//        Сделать проверку на существование треугольника
//        (например, 1, 2, 3 - такого треугольника не существует).

//        Площадь треугольника вычисляется по формуле: A = 1/2bh
//        А - площадь треугольника
//        b - сторона треугольника, на которую опущена высота.
//        h - высота треугольника

        while (true) {
            System.out.println("Введите стороны треугольника в порядке возрастания длины: ");
        // если понадобиться получать длины сторон не по порядку -
        // переделать в массив чисел с дальнейшей сортировкой массива
        Scanner scan = new Scanner(System.in);


            double a = scan.nextDouble();
            System.out.println("Сторона а: "+a);
            double b = scan.nextDouble();
            System.out.println("Сторона b: "+b);
            double c = scan.nextDouble();
            System.out.println("Сторона c: "+c);
            double height;

            double triangleSQ;

            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                //треугольник равнобедренный
                triangleSQ = (a * b) / 2;
                System.out.println("Площадь прямоугольного треугольника: " + triangleSQ+"\n");
            } else if (a == b && b == c) {
                //треугольник равносторонний
                height = Math.sqrt(Math.pow(a, 2) - Math.pow(a, 2) / 4);
                triangleSQ = 0.5 * a * height;
                System.out.println("Площадь равностороннего треугольника: " + triangleSQ+"\n");
            } else if (a == b && c != a) {
                triangleSQ = (0.5 * c) * (Math.sqrt((a + 0.5 * c) * (a - 0.5 * c)));
                System.out.println("Площадь равнобедренного треугольника: " + triangleSQ+"\n");
            } else if (a == c && b != a) {
                triangleSQ = (0.5 * b) * (Math.sqrt((a + 0.5 * b) * (a - 0.5 * b)));
                System.out.println("Площадь равнобедренного треугольника: " + triangleSQ+"\n");
            } else if (b == c && a != b) {
                triangleSQ = (0.5 * a) * (Math.sqrt((b + 0.5 * a) * (b - 0.5 * a)));
                System.out.println("Площадь равнобедренного треугольника: " + triangleSQ+"\n");
            } else {
                System.out.println("Такого треугольника не существует..."+"\n");
            }
        }
    }
}
