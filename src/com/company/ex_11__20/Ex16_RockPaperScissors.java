package com.company.ex_11__20;

import java.util.Random;
import java.util.Scanner;

public class Ex16_RockPaperScissors {
//    сколько игр выиграл пользователь,
//    сколько раз каждого вида ходов было выбрано.
//    Дополните игру анализом компьютера ваших ходов
//    и выбор наиболее подходящего против вас хода.


    public static void main(String[] args) {
        // Камень ножницы бумага
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int player_matchWin = 0;
        int player_roundWin = 0;
        int comp_matchWin = 0;
        int comp_roundWin = 0;
        int round = 0;


        int scissorsCount = 0;
        int paperCount = 0;
        int rockCount = 0;

        StringBuilder stringBuilder = new StringBuilder();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            if (playerScore == 3 || computerScore == 3) {
                if (playerScore == 3) player_matchWin++;
                else comp_matchWin++;
                System.out.println("Игра окончена");
                System.out.println("/////////////////////////////////////////+\n");

                break;
            }


            String[] game = {"камень", "ножницы", "бумага"};
            System.out.println("выберите ответ: ");
            System.out.println("1.Камень     2.Ножницы     3.Бумага");


            int choice = scan.nextInt();
            round++;
            String request = game[choice - 1];
            String answer = game[rand.nextInt(3)];


            if (request.equals(answer)) {
                stringBuilder.append("В раунде #").append(round).append(" компьютер ошибся, выбрав ")
                        .append(answer).append(".\nЛучший ответ:");
                if (request.equals("камень")) {
                    rockCount += 2;
                    stringBuilder.append(" бумага.\n");
                }
                if (request.equals("ножницы")) {
                    scissorsCount += 2;
                    stringBuilder.append(" камень.\n");
                }
                if (request.equals("бумага")) {
                    paperCount += 2;
                    stringBuilder.append(" ножницы.\n");
                }

                System.out.println(request + " VS " + answer);
                System.out.println("Оба игрока выбрали " + answer + ". Ничья.");
                System.out.println("Счет: " + playerScore + ":" + computerScore);
                System.out.println("/////////////////////////////////////////+\n");


            } else if ((request.equals("камень") && answer.equals("ножницы"))
                    || (request.equals("ножницы") && answer.equals("бумага"))
                    || (request.equals("бумага") && answer.equals("камень"))) {
                stringBuilder.append("В раунде #").append(round).append(" компьютер ошибся, выбрав ")
                        .append(answer).append(".\nЛучший ответ:");
                if (request.equals("камень")) {
                    rockCount++;
                    scissorsCount++;
                    stringBuilder.append(" бумага.\n");
                }
                if (request.equals("ножницы")) {
                    scissorsCount++;
                    paperCount++;
                    stringBuilder.append(" камень.\n");
                }
                if (request.equals("бумага")) {
                    paperCount++;
                    rockCount++;
                    stringBuilder.append(" ножницы.\n");
                }


                System.out.println(request + " VS " + answer);
                System.out.println("Вы победили!");
                playerScore++;
                player_roundWin++;

                System.out.println("Счет: " + playerScore + ":" + computerScore);
                System.out.println("/////////////////////////////////////////+\n");
            } else if ((request.equals("камень") && answer.equals("бумага"))
                    || (request.equals("ножницы") && answer.equals("камень"))
                    || (request.equals("бумага") && answer.equals("ножницы"))) {
                comp_roundWin++;
                if (request.equals("камень")) {
                    rockCount++;
                    paperCount++;
                }
                if (request.equals("ножницы")) {
                    scissorsCount++;
                    rockCount++;
                }
                if (request.equals("бумага")) {
                    paperCount++;
                    scissorsCount++;
                }
                System.out.println(request + " VS " + answer);
                System.out.println("Компьютер победил!");

                computerScore++;
                System.out.println("Счет: " + playerScore + ":" + computerScore);
                System.out.println("/////////////////////////////////////////+\n");

            } else {
                System.out.println("Ошибка ввода!");
                System.out.println("/////////////////////////////////////////+\n");
            }

        }
        System.out.println("Всего сыграно раундов: " + round);
        System.out.println("Игрок выиграл раундов: " + player_roundWin);
        System.out.println("Игрок выиграл матчей: " + player_matchWin);
        System.out.println("Компьютер выиграл раундов: " + comp_roundWin);
        System.out.println("Компьютер выиграл матчей: " + comp_matchWin);
        System.out.println("Сыграно Ножницы: " + scissorsCount);
        System.out.println("Сыграно Камень: " + rockCount);
        System.out.println("Сыграно Бумага: " + paperCount);
        System.out.println(stringBuilder);

    }
}
