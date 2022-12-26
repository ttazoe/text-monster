package org.example;

public class HitPoint {
    final int currentAmount;
    final int maxAmount;

    public HitPoint(final int currentAmount, final int maxAmount) {
        if (currentAmount < 0 || maxAmount < 0) {
            throw new IllegalArgumentException("hit point should be more than 0");
        }
        if (currentAmount > maxAmount) {
            throw new IllegalArgumentException("currentAmount should be less than maxAmount");
        }

        this.currentAmount = currentAmount;
        this.maxAmount = maxAmount;
    }

    public HitPoint damaged(final Damage damage) {
        int damagedHp = Math.max(0, this.currentAmount - damage.damage);
        return new HitPoint(damagedHp, this.maxAmount);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HitPoint)) {
            return false;
        }
        HitPoint hp = (HitPoint) obj;
        return this.currentAmount == hp.currentAmount;
    }
}
