package com.lbg;

public class Treasure
{
    private int value;

    private int xPos;
    private int yPos;

    public Treasure(int value, int xPos, int yPos) {
        this.value = value;
        this.xPos = xPos;
        this.yPos = yPos;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
}
