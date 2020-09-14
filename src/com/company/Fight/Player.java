package com.company.Fight;

public class Player extends Fighter {
    @Override
    public void hit(Fighter other) {
        super.hit(other);
    }

    public Player(String name, int level) {
        super(name, level);

    }

    @Override
    public void block(Fighter other) {
        super.block(other);
    }
}
