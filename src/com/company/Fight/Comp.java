package com.company.Fight;

import java.util.Random;

public class Comp extends Fighter {
    Random rand = new Random();


    public Comp(String name, int level) {
        super(name, level);
    }

    @Override
    public void hit(Fighter other) {
        super.hit(other);
    }

    @Override
    public void block(Fighter other) {
        super.block(other);
    }
}
