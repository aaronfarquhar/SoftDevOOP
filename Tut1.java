package Tutorial_Folder;

import java.util.Scanner;

public class Tut1 {


    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);


    String choice = "";

        int card1;
        int card2;
        int new_card;
        int total;

        card1 = (int)(Math.random() * 10) + 1;
        card2 = (int)(Math.random() * 10) + 1;

        total = card1 + card2;

        System.out.println("Card 1 is " + card1);
        System.out.println("Card 2 is " + card2);

        System.out.println("Would you like to another card? Y/N");

        choice = kboard.next();

        while (choice.equalsIgnoreCase("y"))
        {
            new_card = (int)(Math.random() * 10);

            System.out.println("Your new card is " + new_card);

            System.out.println("Would you like to another card? Y/N");

            choice = kboard.next();

        }

        if(total>19 && total <= 21) {

            System.out.println("you have Won");
        }

        else
            {
                System.out.println("You Have Lost");

            }



    }

}
