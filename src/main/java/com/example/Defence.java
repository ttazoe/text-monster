package com.example;

public class Defence {
    final static int MIN = 0;
    final int physicalDefence;

    public Defence(final int physicalDefence) {
        if (physicalDefence < 0) {
            throw new IllegalArgumentException("speed should be more than 0");
        }
        this.physicalDefence = physicalDefence;
    }
}


