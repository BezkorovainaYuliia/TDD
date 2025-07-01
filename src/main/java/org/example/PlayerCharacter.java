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
        return new int[]{x, y};
    }

    public static int[] moveS() {
        y--;
        return new int[]{x, y};
    }
    public static int[] moveD(){
        y++;
        x++;
        return new int[]{x, y};
    }

    public static int[] moveA(){
        y--;
        x--;
        return new int[]{x, y};
    }
}
