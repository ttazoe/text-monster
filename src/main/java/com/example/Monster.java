package com.example;


public class Monster {
    MonsterId id;
    MonsterName name;
    HitPoint hitPoint;
    Attack attack;
    Defence defence;
    Speed speed;

    public Monster(final MonsterId id,
                   final MonsterName name,
                   final HitPoint hitpoint,
                   final Attack attack,
                   final Defence defence,
                   final Speed speed) {
        this.id = id;
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }

    public void incurHitPointDamage(final Damage damage) {
        this.hitPoint = this.hitPoint.incurDamage(damage);
    }


    public boolean isAlive(){
        if (this.hitPoint.isZero()) return false;
        return true;
    }


    @Override
    public String toString() {
        return this.name.toString();
    }
}