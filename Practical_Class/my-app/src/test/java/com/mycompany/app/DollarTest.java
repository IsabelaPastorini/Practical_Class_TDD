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
    public void assertEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Dollar(5).equals(new Franc(6)));
    }

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
     }

     @Test
     public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
     }
}
