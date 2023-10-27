package com.lbg;

public class Grid
{
    private int maxX;

    private int maxY;

    private int[][] gridStatus;


    public Grid(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.gridStatus = new int[maxX][maxY];

        for (int i = 0; i < maxX ; i++)
        {
            for (int j = 0; j < maxY; j++)
            {
                this.gridStatus[i][j] = 0;
            }
        }
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public void setGridStatus(int xChoice, int yChoice, int objectType)
    {
        this.gridStatus[xChoice][yChoice] = objectType;
    }

    public int[][] getGridStatus()
    {
        return gridStatus;
    }
}
