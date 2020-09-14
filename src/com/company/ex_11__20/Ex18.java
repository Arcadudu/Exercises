package com.company.ex_11__20;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {

//        Даны числа h и m,
//        где h - количество часов, m - количество минут некоторого момента времени.
//        Найдите угол между часовой и минутной стрелками в этот момент времени.

        while (true) {
            Scanner scan = new Scanner(System.in);
            int[] clock = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            String[][] time = new String[27][27];

            System.out.println("////////////////////////////////////");
            System.out.println("Укажите направление часовой стрелки");
            int h = scan.nextInt();
            System.out.println("Укажите направление минутной стрелки");
            int m = scan.nextInt();

            if (h == 12) {
                h = 0;
            }
            if (m == 12) {
                m = 0;
            }

            int hourValue = clock[h] * 30;
            int minuteValue = clock[m] * 30;


            int angle = Math.abs(hourValue - minuteValue);
            if (angle > 180) {
               angle = 360 - angle;
            }


            System.out.println();
            if(h == 0){
                System.out.println("Часовая стрелка смотрит на 12");
            } else {
                System.out.println("Часовая стрелка смотрит на " + h);
            }
            if(m == 0){
                System.out.println("Минутная стрелка смотрит на 12");
            } else {
                System.out.println("Минутная стрелка смотрит на " + m);
            }
            System.out.println("Угол между стрелками равен: " + angle+" градусов");
            System.out.println("////////////////////////////////////");
            System.out.println();
            System.out.println();

            for (int y = 0; y< time.length; y++){
                for(int x = 0; x<time[y].length; x++){
                    time[y][x] = " ";
                    time[13][13] = Integer.toString(angle);
                    time[0][13]="12";
                    time[1][20]="*";
                    time[6][25]="*";
                    time[13][26]="3";
                    time[20][25]="*";
                    time[25][20]="*";
                    time[26][13]="6";
                    time[25][6]="*";
                    time[20][1]="*";
                    time[13][0]="9";
                    time[6][1]="*";
                    time[1][6]="*";

                    if (h == 0){

                        time[12][13]="*";

                        time[10][13]="*";

                        time[8][13] ="*";

                        time[6][13] ="*";


                    }
                    if (m == 0) {

                        time[12][13]="*";

                        time[10][13]="*";

                        time[8][13] ="*";

                        time[6][13] ="*";

                        time[4][13] ="*";

                    }
                    if (h == 1){

                        time[12][14]="*";

                        time[10][15]="*";

                        time[8][16] ="*";

                        time[6][17] ="*";


                    }
                    if (m == 1){

                        time[12][14]="*";

                        time[10][15]="*";

                        time[8][16] ="*";

                        time[6][17] ="*";

                        time[4][18] ="*";

                    }
                    if (h == 2){

                        time[12][14]="*";

                        time[11][16]="*";

                        time[10][18]="*";

                        time[9][20] ="*";



                    } if (m == 2){

                        time[12][14]="*";

                        time[11][16]="*";

                        time[10][18]="*";

                        time[9][20] ="*";

                        time[8][22] ="*";

                    }
                    if (h == 3){

                        time[13][14]="*";

                        time[13][16]="*";

                        time[13][18]="*";

                        time[13][20] ="*";

                    }
                    if (m == 3){

                        time[13][14]="*";

                        time[13][16]="*";

                        time[13][18]="*";

                        time[13][20] ="*";

                        time[13][22] ="*";
                    }
                    if (h == 4 || m == 4){

                        time[14][14]="*";

                        time[15][16]="*";

                        time[16][18]="*";

                        time[17][20]="*";

                    }
                    if (m == 4){

                        time[14][14]="*";

                        time[15][16]="*";

                        time[16][18]="*";

                        time[17][20]="*";

                        time[18][22]="*";
                    }

                    if (h == 5){

                        time[14][14]="*";

                        time[16][15]="*";

                        time[18][16]="*";

                        time[20][17]="*";

                    }
                    if (m == 5){

                        time[14][14]="*";

                        time[16][15]="*";

                        time[18][16]="*";

                        time[20][17]="*";

                        time[22][18]="*";
                    }
                    if (h == 6){

                        time[14][13]="*";

                        time[16][13]="*";

                        time[18][13]="*";

                        time[20][13]="*";

                    }
                    if (m == 6){

                        time[14][13]="*";

                        time[16][13]="*";

                        time[18][13]="*";

                        time[20][13]="*";

                        time[22][13]="*";
                    }
                    if (h == 7){

                        time[14][12]="*";

                        time[16][11]="*";

                        time[18][10]="*";

                        time[20][9] ="*";

                    }
                    if (m == 7){

                        time[14][12]="*";

                        time[16][11]="*";

                        time[18][10]="*";

                        time[20][9] ="*";

                        time[22][8] ="*";
                    }
                    if (h == 8){

                        time[14][12]="*";

                        time[15][10]="*";

                        time[16][8] ="*";

                        time[17][6] ="*";

                    }
                    if (m == 8){

                        time[14][12]="*";

                        time[15][10]="*";

                        time[16][8] ="*";

                        time[17][6] ="*";

                        time[18][4] ="*";
                    }
                    if (h == 9){

                        time[13][12]="*";

                        time[13][10]="*";

                        time[13][8] ="*";

                        time[13][6] ="*";

                    }
                    if (m == 9){

                        time[13][12]="*";

                        time[13][10]="*";

                        time[13][8] ="*";

                        time[13][6] ="*";

                        time[13][4] ="*";
                    }
                    if (h == 10){

                        time[12][12]="*";

                        time[11][10]="*";

                        time[10][8] ="*";

                        time[9][6] ="*";

                    }
                    if (m == 10){

                        time[12][12]="*";

                        time[11][10]="*";

                        time[10][8] ="*";

                        time[9][6] ="*";

                        time[8][4] ="*";
                    }
                    if (h == 11){

                        time[12][12]="*";

                        time[10][11]="*";

                        time[8][10] ="*";

                        time[6][9] ="*";

                    }
                    if (m == 11){

                        time[12][12]="*";

                        time[10][11]="*";

                        time[8][10] ="*";

                        time[6][9] ="*";

                        time[4][8] ="*";
                    }

                    System.out.print(time[y][x] + "  ");
                }
                System.out.println();
            }

            System.out.println();

        }
    }
}
