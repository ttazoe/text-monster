package com.example;

import java.util.Objects;

public class Speed implements Comparable<Speed> {
    final static int MIN = 0;
    final int speed;

    public Speed(final int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("speed should be more than 0");
        }
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speed speed1 = (Speed) o;
        return speed == speed1.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public int compareTo(Speed o) {
        if (this.speed < o.speed) {
            return -1;
        }
        if (this.speed > o.speed) {
            return 1;
        }
        return 0;
    }
}
