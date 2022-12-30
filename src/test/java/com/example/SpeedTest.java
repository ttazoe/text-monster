package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SpeedTest {
    @Test
    public void testCompareTo(){
        Speed sp1 = new Speed(5);
        Speed sp2 = new Speed(1);
        Speed sp3 = new Speed(5);
        Speed sp4 = new Speed(10);

        assertEquals(sp1.compareTo(sp2),1);
        assertEquals(sp1.compareTo(sp3),0);
        assertEquals(sp1.compareTo(sp4),-1);
    }
}