package com.company.StaminaPrint;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String answer;
        String path = "C:\\Users\\Arcadudu\\IdeaProjects\\Exercises\\src\\com\\company\\StaminaPrint\\words";

        FileInputStream stream = new FileInputStream(path);
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);

        String text = new String(data);
        String[] words = text.split(" ");


        while (true) {
            int randIndex = rand.nextInt(words.length);
            String request = words[randIndex];
            System.out.println(request);
            answer = scan.nextLine();
            if (answer.equals("отпусти")) break;
            if (answer.equals(request)) {
                continue;
            } else {
                System.out.println("ошибка!");

            }

        }

    }
}
