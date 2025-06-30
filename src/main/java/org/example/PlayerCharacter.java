package org.example;

public class PlayerCharacter {
    static int x = 0;
    static int y = 0;
    public static int getX(){
        return x;
    }
    public static int getY(){
        return y;
    }

    public static int[] moveW() {
        x++;
        int [] moveX = new int[2];
        moveX[0] = y;
        moveX[1] = x;
        //System.out.println(moveX[0] + " " + moveX[1]);
        return moveX;
    }
}
