package com.lbg;

public class Monster
{
    private int xPos;
    private int yPos;
    private String greeting;

    private int movement;


    public Monster(int xPos, int yPos, String greeting, int movement) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.greeting = greeting;
        this.movement = movement;
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
}
