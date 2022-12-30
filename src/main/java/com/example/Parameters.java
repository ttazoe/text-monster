package com.example;

public class Parameters {
    final HitPoint hitpoint;
    final PhysicalAttack physicalAttack;
    final PhysicalDefence physicalDefence;
    final Speed speed;

    public Parameters(HitPoint hitpoint, PhysicalAttack physicalAttack, PhysicalDefence physicalDeffence, Speed speed) {
        this.hitpoint = hitpoint;
        this.physicalAttack = physicalAttack;
        this.physicalDefence = physicalDeffence;
        this.speed = speed;
    }
}
