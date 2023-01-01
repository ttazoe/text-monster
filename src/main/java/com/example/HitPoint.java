package com.example;

public class HitPoint {
    private final static int MIN = 0;
    private final int maxAmount;
    private int currentAmount;

    // Getter
    public int getMaxAmount() {
        return maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    // Constructor
    public HitPoint(final int currentAmount, final int maxAmount) {
        if (currentAmount < MIN || maxAmount < MIN) {
            throw new IllegalArgumentException("hit point should be more than 0");
        }
        if (currentAmount > maxAmount) {
            throw new IllegalArgumentException("currentAmount should be less than maxAmount");
        }

        this.currentAmount = currentAmount;
        this.maxAmount = maxAmount;
    }

    /**
     * Reduce daage amount from currentAmount
     * @param damage
     */
    public HitPoint incurDamage(final Damage damage) {
        int damagedHp = Math.max(MIN, this.currentAmount - damage.getDamage());
        return new HitPoint(damagedHp, this.maxAmount);
    }

    public boolean isZero(){
        return this.currentAmount == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(this.currentAmount);
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
