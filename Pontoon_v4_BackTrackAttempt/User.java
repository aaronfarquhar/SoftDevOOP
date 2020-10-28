package Pontoon_v4_BackTrackAttempt;


import java.util.Scanner;

/**
 *
 * will handle all the user actions including hand storage ect.
 *
 */
public class User extends Player {

    Scanner kboard = new Scanner(System.in);


    String playerDrawChoice = "";
    int playerNumberOfDraws = 0;

    public void playerRun() {


        playerDrawChoice = kboard.next();

        while (playerDrawChoice.equals("y"))
        {



            System.out.println("You drew " + playerDraw);


            System.out.println("Your total is " + playerTotal);


            System.out.println("would you like to continue? Y/N");

            playerDrawChoice = kboard.next();


            playerNumberOfDraws++;

        }
    }
}