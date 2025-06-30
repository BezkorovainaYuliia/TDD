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

    @Test
    void moveW()
    {
        int [] moveWX = new int[2];
        moveWX[0] = 0;
        moveWX[1] = 1;
        assertArrayEquals(moveWX, PlayerCharacter.moveW());
    }

}