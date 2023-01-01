package com.example;

public class MonsterName {
    final String monsterName;

    public MonsterName(final String monsterName) {
        this.monsterName = monsterName;
    }

    @Override
    public String toString() {
        return this.monsterName;
    }
}
