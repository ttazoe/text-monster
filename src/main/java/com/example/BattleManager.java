package com.example;

public class BattleManager {
    public static void main(String[] args) {
        Monster player = new Monster(new MonsterId(1), new MonsterName("Pika"), new HitPoint(30, 30), new PhysicalAttack(10), new PhysicalDefence(10), new Speed(30));
        Monster enemy = new Monster(new MonsterId(2), new MonsterName("Star"), new HitPoint(30, 30), new PhysicalAttack(10), new PhysicalDefence(10), new Speed(30));



    }
}