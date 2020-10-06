package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Unit test for TDD class
 */
public class DollarTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15),five.times(3));
    }

    @Test
    public void assertEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}
