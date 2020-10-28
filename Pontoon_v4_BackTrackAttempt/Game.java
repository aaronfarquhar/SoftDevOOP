package Pontoon_v4_BackTrackAttempt;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * This class plays the game, currently mostly copied from V2 or V3, some of the code here will be divided into other classes
 * like the code dealing with the players hand other parts need to be deleted
 *
 */
public class Game {

    public void startPlaying() {
        Scanner kboard = new Scanner(System.in);


        int houseValue;

        int playerDraw1;
        int playerNumberOfDraws = 0;


        String playerDrawChoice = "";

        int playerTotal = 0;

        ArrayList<Integer> cards = new ArrayList<Integer>();


        houseValue = House.getHouse();

        System.out.println("would you like to Play? Y/N");

        playerDrawChoice = kboard.next();

        while (playerDrawChoice.equalsIgnoreCase("y")) {                                                                   /*Loop to populate the list of the cards the
                                                                                 player draws only while the player answers Y*/

            System.out.println("The total to beat is " + houseValue);

            playerDraw1 = Player.getNumber();

            System.out.println("You drew " + playerDraw1);

            cards.add(playerDraw1);

            playerTotal = playerTotal + cards.get(playerNumberOfDraws);

            System.out.println("Your total is " + playerTotal);


            System.out.println("would you like to continue? Y/N");

            playerDrawChoice = kboard.next();

            playerNumberOfDraws++;                                          //counts the number of draws
        }


        if ((playerTotal > houseValue) && (playerTotal <= 21)) {
            System.out.println("you have won");

            System.out.println("you drew " + playerNumberOfDraws + " times this game");

            System.out.println("Here are the cards you drew ");

            for (int i = 0; i < cards.size(); i++) {
                System.out.println(cards.get(i));
                System.out.println("");
            }

        } else {
            if (playerTotal < houseValue) {
                System.out.println("You lost");

                System.out.println("you drew " + playerNumberOfDraws + " times this game");

                System.out.println("Here are the cards you drew ");

                for (int i = 0; i < cards.size(); i++) {
                    System.out.println(cards.get(i));
                    System.out.println("");
                }


            } else {
                if (playerTotal > 21) {
                    System.out.println("Your bust try again");

                    System.out.println("you drew " + playerNumberOfDraws + " times this game");

                    System.out.println("Here are the cards you drew ");


                    for (int i = 0; i < cards.size(); i++) {
                        System.out.println(cards.get(i));
                        System.out.println("");
                    }


                }
            }
        }
    }
}