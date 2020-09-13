package headFirst_Challenges;

public class GuessGame {
    player p1;
    player p2;
    player p3;

    public void startGame()
    {
        p1 = new player();
        p2 = new player();
        p3 = new player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean P1isRight = false;
        boolean P2isRight = false;
        boolean P3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9");


        while(true)
        {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player one guessed "+ guessP1);

            guessP2 = p2.number;
            System.out.println("Player one guessed "+ guessP2);

            guessP3 = p3.number;
            System.out.println("Player one guessed "+ guessP3);

            if (guessP1 == targetNumber)
            {
                P1isRight = true;
            }

            if (guessP2 == targetNumber)
            {
                P2isRight = true;
            }

            if (guessP3 == targetNumber)
            {
                P3isRight = true;
            }

            if (P1isRight || P2isRight || P3isRight)
            {
                System.out.println("player one is right? " + P1isRight);
                System.out.println("player two is right? " + P2isRight);
                System.out.println("player three is right? " + P3isRight);
                System.out.println("Game is now over.");
                break;

            }
            else
            {
                System.out.println("Players will need to guess again");
            }
        }


    }
}
