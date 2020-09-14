package com.company.ex_41_50;

//Вывести англ. алфавит по 5 букв в строке.
public class Ex47 {
    public static void main(String[] args) {

        ////////странный, но короткий вариант
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
            if (i == 101 || i == 106 || i == 111 || i == 116 || i == 121) System.out.println();
        }




        System.out.println();//пропуск строки
        System.out.println();//пропуск строки
        System.out.println();//пропуск строки
        System.out.println();//пропуск строки





        ///////длинный ебанутый вариант
        int count = 0;
        for (int i = 0; i <= 25; i++) {
            char a = (char) ((char) 97 + i);
            count++;
            if (count > 5) {
                System.out.println();
                count = 1;
            }
            System.out.print(a);
        }


    }


}
