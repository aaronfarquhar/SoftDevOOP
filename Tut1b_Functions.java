package Tutorial_Folder;

import java.util.Scanner;

public class Tut1b_Functions {



    public static int getNumber()                       //Geerates number between 1 and 10
    {
        int card;

        card = (int)(Math.random() * 10) + 1;

        return (card);

    }

    public static int calcTotal(int cardDraw1, int cardDraw2, int new_card)         //to calulate the total
    {

        int total;



        total = cardDraw1 + cardDraw2 + new_card;                       //need to have new_card in order to caculate within the while loop further down

        return (total);
    }

    public static boolean getResult(int total)                      //to find if the total is between 18 and 21
    {
        boolean result;

        if(total > 18 && total <= 21)
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
            boolean result;

            if( total > 21) {

                result = true;
            }
            else
            {
                result = false;
            }


            return result;

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

        cardDraw1 = getNumber();
        cardDraw2 = getNumber();

        total = calcTotal(cardDraw1, cardDraw2, new_card);


        System.out.println("You have drawn a " + cardDraw1 + " and a " +cardDraw2);

        System.out.println("Would you like to draw another? Y/N");

        choice = kboard.next();

        while (choice.equalsIgnoreCase("y"))
        {

           new_card = getNumber();

           total = calcTotal(cardDraw1, cardDraw2, new_card);


            System.out.println("Your new card is " + new_card);
                                                                                //Improvement note - If result in here, breaking the loop per each if so that the result will interupt the hitting if you go bust?
            System.out.println("Would you like to another card? Y/N");

            choice = kboard.next();

        }

        result = getResult( total);

        busted = getBusted(total);

        if (result && !busted)
        {
            System.out.println("you win!");
        }
        else
            if (busted && !result)
        {
            System.out.println("Your are Busted");
        }
        else
            if(!busted && !result)            //Why is result always true?
        {
            System.out.println("Too low");
        }







    }

}
