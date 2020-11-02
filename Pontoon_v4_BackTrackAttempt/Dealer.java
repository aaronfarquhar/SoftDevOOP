package Pontoon_v4_BackTrackAttempt;

/**
 *
 * handles the dealer, including the dealers draw action and storing the hand and the hands total
 * should have a way to ensure the dealer's hand total's at least 16
 *
 */
public class Dealer extends Player
{
    /**
     * Draws two cards for the dealer, stores them in the dealers hand
     *
     */
    public void draw()
    {

        playerDraw = Card.getValue();

        StoreHand.add(playerDraw);


        playerDraw = Card.getValue();

        StoreHand.add(playerDraw);



        while ((StoreHand.get(0) + StoreHand.get(1)) < 16 )
        {

            StoreHand.remove(0);

            StoreHand.remove(0);

            playerDraw = Card.getValue();

            StoreHand.add(playerDraw);


            playerDraw = Card.getValue();

            StoreHand.add(playerDraw);

        }

    }

    /**
     *stores the dealers hand, might not be needed?
     *
     */
    public void hand()
    {

        playerTotal = StoreHand.get(0) + StoreHand.get(1);



    }
}
