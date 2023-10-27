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

        System.out.println(playerGrid.getMaxX() + ", " + playerGrid.getMaxY());

        Player player = new Player();
        player.generateStartPos(playerGrid);

        System.out.println(player.getxPos() + ", " + player.getyPos());
    }


}
