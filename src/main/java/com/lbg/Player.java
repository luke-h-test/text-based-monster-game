package com.lbg;

public class Player
{
    private int xPos;

    private int yPos;

    private int score;


    public Player(int xPos, int yPos, int score) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.score = score;
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
}
