package com.company.Fight1;

public class Player extends Fighter {
    public Player(String name, int level) {
        super(name, level);
    }

    @Override
    public void getHit(Fighter other) {
        System.out.println("\nВаша очередь бить. Выберите удар:\n ");

        // стамины хватает на все удары
        if (this.getSt() >= 40) {
            System.out.println("1. удар в голову (урон: 20-28 здр | 8 внс) стоимость: 20 внс\n" +
                    "2. удар в корпус (урон: 15-23 здр | 5 внс) стоимость: 15 внс\n" +
                    "3. удар по ногам (урон: 25-38? здр | 5-10? внс) стоимость: 40+10? внс");
            int hitChoice = scanner.nextInt();
            switch (hitChoice) {
                case 1:
                    headHit(other);
                    break;
                case 2:
                    bodyHit(other);
                    break;
                case 3:
                    legHit(other);
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    break;
            }

            // стамины хватает на голову или корпус
        } else if (this.getSt() >= 20 & this.getSt() < 40) {
            System.out.println("1. удар в голову (урон: 20-28 здр | 8 внс) стоимость: 20 внс\n" +
                    "2. удар в корпус (урон: 15-23 здр | 5 внс) стоимость: 15 внс");
            int hitChoice = scanner.nextInt();
            switch (hitChoice) {
                case 1:
                    headHit(other);
                    break;
                case 2:
                    bodyHit(other);
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    break;
            }
            // стамины хватает только на корпус
        } else if (this.getSt() >= 15 & this.getSt() < 20) {
            System.out.println("2. удар в корпус (урон: 15-23 здр | 5 внс) стоимость: 15 внс");
            int hitChoice = scanner.nextInt();
            if (hitChoice == 2) {
                bodyHit(other);
            } else {
                System.out.println("Ошибка ввода");
            }
        } else if (this.getSt() < 15) {
            System.out.println("(!) Вы сильно устали и пропускаете ход, набирая 15 единиц выносливости\n");
            raiseST(15);
        }


    }

    @Override
    public int getBlock(Fighter other) {
        System.out.println("\nСоперник готовит удар. Быберите блок: ");
        System.out.println("1. верхний блок\n2. средний блок\n3. нижний блок ");
        return scanner.nextInt();
    }
}
