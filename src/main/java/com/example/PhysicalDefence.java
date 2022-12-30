package com.example;

public class PhysicalDefence {
    final static int MIN = 0;
    final int physicalDefence;

    public PhysicalDefence(final int physicalDefence) {
        if (physicalDefence < 0) {
            throw new IllegalArgumentException("speed should be more than 0");
        }
        this.physicalDefence = physicalDefence;
    }
}


