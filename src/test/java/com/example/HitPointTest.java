package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitPointTest {
    @Test
    // Constructor test
    /*
    Case 1 : currentAmount = 5, max Amount = 10, OK
    Case 2 : currentAmount = -1, max Amount = 10, NG
    Case 3 : currentAmount = -2, max Amount = -1, NG
    Case 4 : currentAmount = 3, max Amount = -1, NG
    Case 5 : currentAmount = 5, max Amount = 3, NG
     */
    public void testConstructor(){
        HitPoint case1 = new HitPoint(5, 10);
        assertEquals(case1.getCurrentAmount(),5);
        assertEquals(case1.getMaxAmount(),10);

        try {
            new HitPoint(-1, 10);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
        }
        try {
            new HitPoint(-2, -1);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
        }
        try {
            new HitPoint(3, -1);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
        }
        try {
            new HitPoint(5, 3);
            assertTrue(false);
        } catch (IllegalArgumentException e) {
        }
    }


    /*
    Damaged method test
    Case 1 : 10 - 5 = 5
    Case 2 : 10 - 10 = 0
    Case 3 : 10 - 15 = -5
     */
    @Test
    public void testDamaged(){
        HitPoint hp = new HitPoint(10,15);
        Damage damage5 = new Damage(5);
        Damage damage10 = new Damage(10);
        Damage damage15 = new Damage(15);
        assertEquals(new HitPoint(5, 15), hp.incurDamage(damage5));
        assertEquals(new HitPoint(0, 15), hp.incurDamage(damage10));
        assertEquals(new HitPoint(0, 15), hp.incurDamage(damage15));
    }
}