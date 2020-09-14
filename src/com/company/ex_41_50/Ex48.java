package com.company.ex_41_50;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        //Вывести квадрат 7 на 7 из случайных букв. Материал сайта www.itmathrepetitor.ru

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        long megaCount = 0L;
        String result = "";
        String search = scanner.nextLine();

//        for (; ; ) {
//            for (int i = 1; i <= 1000; i++) {
//                //хинт для рандома в указанном диапазоне: max -= min; (Math.random()*max)+min;
//                int rand = (int) (Math.random() * 25) + 97;
//                char symbol = (char) rand;
//
//                stringBuilder.append(symbol);
//
//                count++;
//
//                if (count > 50) {
//                    //System.out.println();
//                    stringBuilder.append("\n");
//                    count = 1;
//                }
//                //System.out.print(symbol);
//            }
//            result = stringBuilder.toString();
//
//
//            megaCount++;
//            if (result.contains("search")) {
//                result.replace("search", "      ");
//                System.out.println(result);
//                System.out.println(megaCount);
//                break;
//            }
//            stringBuilder.setLength(0);
//        }


//        while (true) {
//            int num1 = (int) ((Math.random() * 25) + 97);
//            int num2 = (int) ((Math.random() * 25) + 97);
//            int num3 = (int) ((Math.random() * 25) + 97);
//            int num4 = (int) ((Math.random() * 25) + 97);
//            int num5 = (int) ((Math.random() * 25) + 97);
//            int num6 = (int) ((Math.random() * 25) + 97);
//            int num7 = (int) ((Math.random() * 25) + 97);
//            int num8 = (int) ((Math.random() * 25) + 97);
//
//            char a = (char)num1;
//            char b = (char)num2;
//            char c = (char)num3;
//            char d = (char)num4;
//            char e = (char)num5;
//            char f = (char)num6;
//            char g = (char)num7;
//            char h = (char)num8;
//
//            result = ""+a + b + c + d + e + f + g + h;
//            megaCount++;
//            if (result.contains(search)) break;
//        }
//        System.out.println(result);
//        System.out.println(megaCount);


        ready: while(true){
            result="";
            for (int i = 0; i <search.length() ; i++) {
               // if(i>20)return;
                int rand = (int)(Math.random()*25)+97;
                char ch = (char)rand;
                result += ""+ch;
                if(result.contains(search)){
                    System.out.println(result);
                    System.out.println(megaCount);
                    break ready;
                }
            }
            megaCount++;
        }

    }
}
