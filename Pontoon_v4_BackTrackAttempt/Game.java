package Pontoon_v4_BackTrackAttempt;


import java.util.Scanner;

/**
 *
 * This class plays the game, currently mostly copied from V2 or V3, some of the code here will be divided into other classes
 * like the code dealing with the players hand other parts need to be deleted
 *
 */


public class Game
{



    Player user = new User();
    Player dealer = new Dealer();
    String playerDrawChoice = "";
    int playerNumberOfDraws = 0;

    Scanner kboard = new Scanner(System.in);

    /**
     *
     * contains the game, puts together all the code
     */
    public void startPlaying()
    {

        System.out.println("would you like to play? Y/N");


        playerDrawChoice = kboard.next();

        dealer.draw();

        dealer.hand();

        while (playerDrawChoice.equals("y"))
        {


            user.draw();

            user.hand();



            System.out.println("You drew " + user.playerDraw);


            System.out.println("Your total is " + user.playerTotal);


            System.out.println("Your target is " + dealer.playerTotal);


            if (user.playerTotal > 21 )
            {

                playerDrawChoice = "n";

                System.out.println("You went bust with " + user.playerTotal);

            }
            else if (user.playerTotal == 21)
                {
                    playerDrawChoice = "n";

                    System.out.println("Pontoon! You Won!");


                }
            else
            {
                System.out.println("would you like to continue? Y/N");
                playerDrawChoice = kboard.next();

            }

            playerNumberOfDraws++;


        }

        if (user.playerTotal > dealer.playerTotal && user.playerTotal < 21)
        {

            System.out.println("you won with " + user.playerTotal + " against " +dealer.playerTotal + " and you drew " +playerNumberOfDraws+ " times.");


        }
        else if (user.playerTotal == dealer.playerTotal)
        {

            System.out.println("you drew with " + user.playerTotal + " against " +dealer.playerTotal + " and you drew " +playerNumberOfDraws+ " times.");

        }
        else if (user.playerTotal < dealer.playerTotal)
        {

            System.out.println("you lost with " + user.playerTotal + " against " +dealer.playerTotal + " and you drew " +playerNumberOfDraws+ " times.");

        }







    }
}