package com.lbg;
import java.util.concurrent.ThreadLocalRandom;


public class Player
{
    private int xPos;

    private int yPos;

    private int score;

    public Player()
    {
        this.score = 0;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[] generateStartPos(Grid grid)
    {
        int maxX = grid.getMaxX();
        int maxY = grid.getMaxY();
        int randomX = ThreadLocalRandom.current().nextInt(0, maxX);
        int randomY = ThreadLocalRandom.current().nextInt(0, maxY);

        this.xPos = randomX;
        this.yPos = randomY;

        int[] playerLoc = {randomX, randomY};

        return playerLoc;

    }
}
