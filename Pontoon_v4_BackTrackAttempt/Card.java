package Pontoon_v4_BackTrackAttempt;

/**
 * contains the number generator for creating each card for the hand of each player,
 * plans to use this class to generate a full card using Enums for values and Suit in the future
 * but those plans have not been worked out yet
 */
public class Card
{
    /**
     * generates the value of each card
     * @return card
     */
    public static int getValue()                       //Generates number between 1 and 10
    {
        int card;

        card = (int)(Math.random() * 10 + 1);

        return (card);

    }
}
