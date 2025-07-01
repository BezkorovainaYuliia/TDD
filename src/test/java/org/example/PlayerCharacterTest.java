package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @BeforeEach
    void setUpXundY() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }

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
        moveWX[1] = 1;
        assertArrayEquals(moveWX, PlayerCharacter.moveW());
    }

    @Test
    void moveS()
    {
        int [] moveY = new int[2];
        moveY[1] = -1;
        assertArrayEquals(moveY, PlayerCharacter.moveS());
    }

    @Test
    void moveD()
    {
        int [] moveXY = new int[2];
        moveXY[0] = 1;
        moveXY[1] = 1;
        assertArrayEquals(moveXY, PlayerCharacter.moveD());
    }

    @Test
    void moveA()
    {
        int [] moveXY = new int[2];
        moveXY[0] = -1;
        moveXY[1] = -1;
        assertArrayEquals(moveXY, PlayerCharacter.moveA());
    }

    @Test
    void moveAA()
    {
        int [] moveXY = new int[2];
        moveXY[0] = -2;
        moveXY[1] = -2;
        PlayerCharacter.moveA();
        assertArrayEquals(moveXY, PlayerCharacter.moveA());
    }

}