package com.example;


public class Monster {
    private MonsterId id;
    private MonsterName name;
    private HitPoint hitPoint;
    private PhysicalAttack physicalAttack;
    private PhysicalDefence physicalDefence;
    private Speed speed;

    public Monster(final MonsterId id,
                   final MonsterName name,
                   final HitPoint hitpoint,
                   final PhysicalAttack physicalAttack,
                   final PhysicalDefence physicalDefence,
                   final Speed speed) {
        this.id = id;
        this.name = name;
        this.hitPoint = hitpoint;
        this.physicalAttack = physicalAttack;
        this.physicalDefence = physicalDefence;
        this.speed = speed;
    }

    public void incurHitPointDamage(final Damage damage) {
        this.hitPoint = this.hitPoint.incurDamage(damage);
    }
}