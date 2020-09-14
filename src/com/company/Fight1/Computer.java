package com.company.Fight1;

public class Computer extends Fighter {
    public Computer(String name, int level) {
        super(name, level);
    }

    @Override
    public void getHit(Fighter other) {
        int computerHitChoice;

        // стамины хватает на все удары
        if (this.getSt() >= 30) {
            computerHitChoice = random.nextInt(3);
            switch (computerHitChoice) {
                case 0:
                    headHit(other);
                    break;
                case 1:
                    bodyHit(other);
                    break;
                case 2:
                    legHit(other);
                    break;
            }
        } else if (this.getSt() >= 20 & this.getSt() < 30) {
            computerHitChoice = random.nextInt(2);
            switch (computerHitChoice) {
                case 0:
                    headHit(other);
                    break;
                case 1:
                    bodyHit(other);
                    break;
            }
        } else if (this.getSt() >= 15 & this.getSt() < 20) {
            bodyHit(other);
        } else if (this.getSt() < 15) {
            System.out.println("(!)" + this.getName() + " сильно устал и пропускает ход, набирая 15 единиц выносливости");
            raiseST(15);
        }
    }

    @Override
    public int getBlock(Fighter other) {
        return random.nextInt(3);
    }
}
