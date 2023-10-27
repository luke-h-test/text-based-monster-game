package com.lbg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserInterface ui = new UserInterface();
        int[] chosenXY = ui.gridSelection();
        Grid playerGrid = new Grid(chosenXY[0], chosenXY[1]);

        System.out.println("Grid dimensions: " + playerGrid.getMaxX() + "x" + playerGrid.getMaxY());

        Player player = new Player();
        player.generateStartPos(playerGrid);

        System.out.println("Starting player position: " + player.getxPos() + ", " + player.getyPos());

        Monster monster = new Monster();
        monster.generateStartPos(playerGrid);

        System.out.println("Monster position: " + monster.getxPos() + ", " + player.getyPos());
    }


}
