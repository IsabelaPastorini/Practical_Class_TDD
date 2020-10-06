package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class FrancTest {
@Test
public void testFrancMultiplication() {
    assertEquals(new Franc(10), new Franc(5).times(2));
    assertEquals(new Franc(15), new Franc(5).times(3));
 }
}
