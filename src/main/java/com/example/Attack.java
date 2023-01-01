package com.example;

public class Attack {
    final static int MIN = 0;
    final int physicalAttack;

    public Attack(final int physicalAttack) {
        if (physicalAttack < MIN) {
            throw new IllegalArgumentException("Physical Attack should be more than 0");
        }
        this.physicalAttack = physicalAttack;
    }
}
