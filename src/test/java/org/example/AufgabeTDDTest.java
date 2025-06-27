package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AufgabeTDDTest {
    @Test
    void isPositionXZero()
    {
        int expectedX = 0;
        assertEquals(expectedX, PlayerCharacter.getX());
    }

}