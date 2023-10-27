package com.lbg;

import java.util.concurrent.ThreadLocalRandom;

public class Monster
{
    private int xPos;
    private int yPos;
    private String greeting;

    private int movement;

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int[] generateStartPos(Grid grid) {
        int randomX;
        int randomY;
        do {
            int maxX = grid.getMaxX();
            int maxY = grid.getMaxY();
            randomX = ThreadLocalRandom.current().nextInt(0, maxX);
            randomY = ThreadLocalRandom.current().nextInt(0, maxY);
        } while (grid.getGridStatus()[randomX][randomY] != 0);

        this.xPos = randomX;
        this.yPos = randomY;

        int[] monsterLoc = {randomX, randomY};
        return monsterLoc;
    }
}
