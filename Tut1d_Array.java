package Tutorial_Folder;

import java.util.Scanner;

public class Tut1d_Array {



    public static int getNumber()                       //Generates number between 1 and 10
    {
        int card;

        card = (int)(Math.random() * 10 + 1);

        return (card);

    }

    public static int calcTotal(int cardDraw1, int cardDraw2)         //to calulate the total
    {

        int total;


        total = cardDraw1 + cardDraw2;


        return (total);
    }

    public static boolean getResult(int total, int house)                      //to find if the total is between 18 and 21
    {
        boolean result;

        if(total > house && total < 21)
        {

            result = true;
        }
        else
        {
            result = false;
        }


          return result;
    }

    public static boolean getBusted(int total)     //if statment for finding if total is over 21
        {
            boolean busted;

            if( total > 21) {

                busted = true;
            }
            else
            {
                busted = false;
            }


            return busted;

        }

        public static int getHouse()
    {
        int house;

        house = (int)(Math.random() * 6 + 16);                         //* 20 ensures the house cannot generate more than 20, so that it is possible to win

        return house;
    }



    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);


        String choice;

        int cardDraw1;
        int cardDraw2;
        int new_card = 0;
        int total;
        boolean result;
        boolean busted;
        int houseDraw;




        cardDraw1 = getNumber();
        cardDraw2 = getNumber();
        houseDraw = getHouse();


        total = calcTotal(cardDraw1, cardDraw2);


        System.out.println("You have drawn a " + cardDraw1 + " and a " +cardDraw2);

        System.out.println("the house has " + houseDraw);

        System.out.println("Would you like to draw another? Y/N");

        choice = kboard.next();

        while (choice.equalsIgnoreCase("y"))
        {

            int cardArray[] = {cardDraw1,cardDraw2,new_card};

           new_card = getNumber();

           total = total + new_card;


            System.out.println("Your new card is " + new_card);

            System.out.println("your total is " +total );
                                                                                //Improvement note - If result in here, break the loop somehow so that the result will interupt the player if you go bust?
            System.out.println("Would you like to another card? Y/N");

            choice = kboard.next();

        }

        result = getResult( total, houseDraw);

        busted = getBusted(total);

        if (result)
        {
            System.out.println("you win!");
        }
        else
            if (busted)
        {
            System.out.println("Your are Busted");
        }
        else
        {
            System.out.println("Too low");
        }

    }

}
