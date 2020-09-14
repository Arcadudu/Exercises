package com.company.Fight;

import java.util.Random;

class Fighter {
Random rand = new Random();


    private String name;
    private int hp = 100;
    private int st = 100;

    private int hpDmg = 20;
    private int hpExDmg;
    private int totalDmg;

    private int stDmg;
    private int stHitCost;
    private int stBlockBonus;

    private int round =0;



    public Fighter(String name, int level){
        this.name = name;
        hp = hp * level;
        st = st * level;
        hpDmg = hpDmg * level;
        stDmg= hpDmg/2;
        hpExDmg = (int) rand.nextInt(8) + level;
        totalDmg = hpDmg+hpExDmg;
        stHitCost = 20;
        stBlockBonus = stHitCost/2;
    }


    public void hit(Fighter other){
        // сначала успешный удар

        this.hpExDmg = (int) rand.nextInt(8);
        this.st = this.st - this.stHitCost;

        other.hp = other.hp - (this.totalDmg);
        other.st = other.st - this.stDmg;
        round++;
        System.out.println("\n"+"*************"+" Раунд "+round+" **************");
        System.out.println(this.name+" проводит успешный удар"+
                "\n"+other.name+" получает "+getTotalDmg()+" урона");
        System.out.println();
        combatInfo(other);

    }


    public void block(Fighter other){
        // успешный блок
        this.st = st + stBlockBonus;

        other.st = st - stHitCost;
        System.out.println("\n"+"*************"+" Раунд "+round+" **************");
        System.out.println(this.name+" успешно блокирует удар"+
                "\n"+other.name+" тратит "+getStHitCost()+" выносливости");
        System.out.println();
        combatInfo(other);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getSt() {
        return st;
    }

    public int getHpDmg() {
        return hpDmg;
    }

    public int getHpExDmg() {
        return hpExDmg;
    }

    public int getTotalDmg() {
        return totalDmg;
    }

    public int getStDmg() {
        return stDmg;
    }

    public int getStHitCost() {
        return stHitCost;
    }

    public int getStBlockBonus() {
        return stBlockBonus;
    }



    public void combatInfo(Fighter other){
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Боец 1: "+this.getName());
        System.out.println("Здоровье: "+this.getHp());
        System.out.println("Выносливость: "+this.getSt());
        System.out.println("---------------------------");
        System.out.println("Боец 2: "+ other.getName());
        System.out.println("Здоровье: "+other.getHp());
        System.out.println("Выносливость: "+other.getSt());
        System.out.println("+++++++++++++++++++++++++++");
    }

    public void getStats(){
        System.out.println("name: "+getName());
        System.out.println("hpdmg: "+getHpDmg()+"\n"
                +"hpExDmg: "+getHpExDmg()+"\n"
                +"stDmg: "+getStDmg()+"\n"
                +"hitCost: "+getStHitCost()+"\n"
                +"TotalDMG: "+getTotalDmg());
    }
}
