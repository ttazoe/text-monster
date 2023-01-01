package com.example;

public class Parameters {
    final HitPoint hitpoint;
    final Attack attack;
    final Defence defence;
    final Speed speed;

    public Parameters(HitPoint hitpoint, Attack attack, Defence physicalDeffence, Speed speed) {
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.defence = physicalDeffence;
        this.speed = speed;
    }
}
