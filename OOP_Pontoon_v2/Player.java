package OOP_Pontoon_v2;

public class Player {

    public static int getNumber()                       //Generates number between 1 and 10
    {
        int card;

        card = (int)(Math.random() * 10 + 1);

        return (card);

    }


}
