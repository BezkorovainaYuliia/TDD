package org.example;

public class PlayerCharacter {
    public static int x;
    public static int y;

    public static int getX(){
        return x;
    }
    public static int getY(){
        return y;
    }

    public static int[] moveW() {
        y++;
        int [] moveX = new int[2];
        moveX[0] = x;
        moveX[1] = y;
        return moveX;
    }

    public static int[] moveS() {
        y--;
        int [] moveX = new int[2];
        moveX[0] = x;
        moveX[1] = y;
        return moveX;
    }
    public static int[] moveD(){
        y++;
        x++;
        int [] moveX = new int[2];
        moveX[0] = x;
        moveX[1] = y;
        return moveX;
    }

    public static int[] moveA(){
        y--;
        x--;
        int [] moveX = new int[2];
        moveX[0] = x;
        moveX[1] = y;
        return moveX;
    }
}
