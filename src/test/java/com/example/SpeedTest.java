package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTest {
    @Test
    /**
     * Constructor test
     */
    public void testConstructor (){
        Speed speed = new Speed(10);
        assertEquals(speed.speed, 10);
    }
}