package com.company.ex_1__10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Введите номер вагона: ");
        int wagonNumber = scan.nextInt();


        if((wagonNumber >= 58570037 && wagonNumber <= 58572835)
                || (wagonNumber >= 58573247 && wagonNumber <= 58573445)){
                System.out.println(wagonNumber+ " - РХМ");
        } else if ((wagonNumber >=58572918 && wagonNumber <= 58573197)
                || wagonNumber == 58573494){
                System.out.println(wagonNumber+" - Понижайка");
        } else if(wagonNumber >= 58670000){
                System.out.println(wagonNumber+" - Сетка");
        }
    }
}
