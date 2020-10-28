package Pontoon_v4_BackTrackAttempt;

import java.util.ArrayList;

/**
 *
 * this class will be a super class,
 * any player classes, including the dealer will inherrit most of their methods from this class
 *
 */
public class Player

{

    ArrayList<Integer> StoreHand = new ArrayList();                     //arraylist for storing the hand
    int playerTotal = 0;
    int playerDraw;


    /**
     *
     * draws a card and adds it to the hand, this will use the Card Class
     */
    public void draw()
    {

        playerDraw = Card.getValue();

        StoreHand.add(playerDraw);

    }


    /**
     *
     * stores the hand and total value of the hand,
     */
    public void hand()
    {

        playerTotal = playerTotal + playerDraw;                     //finds the hands total value

    }
}
