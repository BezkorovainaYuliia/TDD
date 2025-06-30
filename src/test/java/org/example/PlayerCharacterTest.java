package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    void isPositionXZero()
    {
        PlayerCharacter.x = 0;
        int expectedX = 0;
        assertEquals(expectedX, PlayerCharacter.getX());
    }

    @Test
    void isPositionYZero()
    {
        PlayerCharacter.y = 0;
        int expectedY = 0;
        assertEquals(expectedY, PlayerCharacter.getY());
    }

    @Test
    void moveW()
    {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int [] moveWX = new int[2];
        moveWX[0] = 0;
        moveWX[1] = 1;
        assertArrayEquals(moveWX, PlayerCharacter.moveW());
    }

    @Test
    void moveS()
    {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int [] moveX = new int[2];
        moveX[0] = 0;
        moveX[1] = -1;
        assertArrayEquals(moveX, PlayerCharacter.moveS());
    }

    @Test
    void moveD()
    {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int [] moveX = new int[2];
        moveX[0] = 1;
        moveX[1] = 1;
        assertArrayEquals(moveX, PlayerCharacter.moveD());
    }

    @Test
    void moveA()
    {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int [] moveX = new int[2];
        moveX[0] = -1;
        moveX[1] = -1;
        assertArrayEquals(moveX, PlayerCharacter.moveA());
    }

}