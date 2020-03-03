package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    //encapsulation
    @Test
    public void getSurname() {
        Father father = new Father("Soeker");

        father.setSurname("Soeka");
        String result = father.getSurname();
        assertEquals("Soeka", result);
    }

    //polymorphism
    @Test
    public void bloodType() {

    }

    //inheritance
    @Test
    public void testSetSurname() {
        Father father = new Father("Soeker");
        Child child = new Child(father.getSurname(), "Yusrah", 20);
        String result = child.getSurname();
        assertSame("Soeker", result);
    }

}
