package Tutorial_Folder;

import java.util.Scanner;

public class Tutorial_2_Aircaft {

    static Scanner kboard = new Scanner(System.in);

    public static String getName()
    {

        String name;

        System.out.println("Please enter the Passenger's name.");

        name = kboard.next();

        return(name);
    }

    public static int getSeatNumber(int numberOfSeats)
    {
        int seat;

        System.out.println("Please enter an unbooked seat number between 1 and " + numberOfSeats);

        seat = kboard.nextInt();

        return(seat);
    }

    public static void booking( String name, int seat, String PassengerName[])
    {
        PassengerName[seat] = name;
    }

    public static void displayPassengerList(int numberOfSeats, String PassengerName[])
    {
        for (int x=0; x<numberOfSeats; x++) {
            System.out.println("Seat Number " + x + " Passenger " + PassengerName[x]);
        }

    }

    public static void cancel(int seat, String PassengerName[])
    {
        PassengerName[seat] = "";
    }


    public static void main(String[] args)
    {

        int numberOfSeats = 10;
        int seatChoice;
        String enterName;
        int menuChoice =0;

        String PassengerName[] = new String[numberOfSeats];



do {

    System.out.println("Please select what you would like to do");
    System.out.println("Press 1 to display all seats and passenger details, 2 to Book a seat, 3 to cancel a booking 4 to display the Earnings report and 5 to exit");

    menuChoice = kboard.nextInt();

    switch(menuChoice){
        case 1:
            System.out.println("here is a list of already booked seats");

            displayPassengerList( numberOfSeats, PassengerName);

            break;

        case 2:
            System.out.println("Here is the Passenger list and their respective seat numbers");

            displayPassengerList( numberOfSeats, PassengerName);

            enterName = getName();

            seatChoice = getSeatNumber(numberOfSeats);

            booking(enterName,seatChoice,PassengerName);

            System.out.println("Seat has been booked.");

            break;
        case 3:
            System.out.println("Here is the Passenger list and their respective seat numbers");

            displayPassengerList( numberOfSeats, PassengerName);

            System.out.println("please enter the seat number you wish to cancel");

            seatChoice = getSeatNumber(numberOfSeats);

            cancel(seatChoice,PassengerName);

            break;
        case 4:
            System.out.println("Earnings");
            break;
        case 5:
            System.out.println("goodbye");
            break;
        default:
            System.out.println("unknown input please enter 1,2,3,4 or 5");
            break;
}
        }
        while (menuChoice != 5);

        kboard.close();
    }
}
