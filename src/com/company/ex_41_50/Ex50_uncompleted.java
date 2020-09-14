package com.company.ex_41_50;

import java.awt.image.Raster;
import java.util.*;

public class Ex50_uncompleted {

    static void getCode(char ch){
        int symbolCode = ch;
        System.out.println(symbolCode);
    }
    public static void main(String[] args) {
//        Сгенерировать пароль для пользователя.
//        Требования: длина от 6 до 20 символов, должен быть ровно один символ подчеркивания,
//        хотя бы две заглавных буквы, не более 5 цифр, любые две цифры подряд недопустимы.
        // '_' - 95 // 'A' - 65 // 'Z' - 90 // '0' - 48 // 'a' - 97 // 'z' - 122

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите желаемую длину пароля(от 6 до 20 символов):  ");
        int length = scanner.nextInt();


        int[] array = new int[length];
        array[0] = 95; // подчеркивание
        array[1] = (int) (Math.random()*25) + 65; // заглавная буква
        array[2] = (int) (Math.random()*25) + 65; // заглавная буква
        array[3] = random.nextInt(9)+1;// цифры
        array[4] = random.nextInt(9)+1;// цифры

        //остатки массива набиваем строчными буквами
        for (int i = 5; i <length; i++) {
//            if()
            array[i] = (int) (Math.random()*25 + 97); // строчная буква
        }

        for (int num:array){
            if(num <10) System.out.print(num);
            else System.out.print((char)num);
        }

        //тут список на всякий случай(!!!!!)
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int num:array) list.add(num);
//        Collections.shuffle(list);
//        list.stream().map(x-> x==65? ((char)x) : )


//        getCode('z');
//        int rand =  random.nextInt(9)+1;
//        System.out.println(rand);
    }

}
//interface Function <T, R> {
//    R apply(T t);
//}
