package com.lbg;

import java.util.Scanner;

public class UserInterface
{
    public int[] gridSelection()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the X dimension for the play grid: ");
        int chosenXPos = Integer.valueOf(sc.nextLine());

        System.out.println("Please enter the Y dimension for the play grid: ");
        int chosenYPos = Integer.valueOf(sc.nextLine());

        int[] coordsToReturn = {chosenXPos, chosenYPos};

        return coordsToReturn;
    }
}
