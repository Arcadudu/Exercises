package com.company.ex_41_50;
//Найдите количество прямоугольных треугольников с целочисленными сторонами, меньшими 100.

public class Ex45 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        //здесь использовал Пифагорову тройку, т.е. 3.4.5 -> 6.8.10 и тд
        int count = 1;
        while(true){
            a*=2;b*=2;c*=2;
            if(c>=100)break;
            if(c*c == a*a+b*b) count++;
        }
        System.out.println(count);
    }
}
