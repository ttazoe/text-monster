package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleManager {
    public static void main(String[] args) {
        Monster player1Monster = new Monster(new MonsterId(1), new MonsterName("Pika"), new HitPoint(30, 30), new Attack(10), new Defence(10), new Speed(30));
        Monster player2Monster = new Monster(new MonsterId(2), new MonsterName("Star"), new HitPoint(30, 30), new Attack(10), new Defence(10), new Speed(30));

        // Create Action List
        Map<Integer, String> actionList = new HashMap<>();
        actionList.put(1, "Attack");
        actionList.put(2, "Item");
        actionList.put(3, "Change Monster");
        actionList.put(4, "Run Away");

        while (true) {
            System.out.println("Player 1's turn");
            String action = selectPlayerAction(actionList);

            if (action == "Attack") {

            }
            // ダメージを計算する
            Damage attackDamage = new Damage(100);
            player2Monster.incurHitPointDamage(attackDamage);

            System.out.println(player2Monster + ", hp : " + player2Monster.hitPoint);

            if (!player2Monster.isAlive()) {
                System.out.println(player2Monster + " is dead");
                break;
            }
        }
        System.out.println("Player 1 : Win");
    }

    public static String selectPlayerAction (Map<Integer, String> actionList) {
        System.out.println("Please select your " + " Action");
        for (int key : actionList.keySet()) {
            System.out.printf("%d : %s\n", key, actionList.get(key));
        }
        System.out.println("------------------");
        System.out.print("Please select your action : ");
        Scanner scanner = new Scanner(System.in);
        int actionId = scanner.nextInt();
        String action = actionList.get(actionId);
        System.out.println("Player 1 selected : " + action);
        System.out.println("------------------");
        return action;
    }

}