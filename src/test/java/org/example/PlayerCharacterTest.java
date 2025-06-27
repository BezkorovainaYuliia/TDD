package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    void isPositionXZero()
    {
        int expectedX = 0;
        assertEquals(expectedX, PlayerCharacter.getX());
    }

    @Test
    void isPositionYZero()
    {
        int expectedY = 0;
        assertEquals(expectedY, PlayerCharacter.getY());
    }

}