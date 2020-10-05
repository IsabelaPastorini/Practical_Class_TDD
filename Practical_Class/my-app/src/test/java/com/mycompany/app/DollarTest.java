package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Unit test for simple App.
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
        five.times(2);
        assertEquals(10,five.amount);
    }
}
