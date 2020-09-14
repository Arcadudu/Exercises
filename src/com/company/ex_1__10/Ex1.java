package com.company.ex_1__10;

public class Ex1 {

    public static void main(String[] args) {

        char [][] array = new char [5][8];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                array[i][j]= 'A';
            }
        }

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}