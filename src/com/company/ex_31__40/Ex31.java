package com.company.ex_31__40;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
//        Вывести на экран n единиц, затем 2n двоек, затем 3n троек. Число n вводит пользователь
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(1);
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(2);
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(3);
        }

    }
}
