package OOP_Pontoon_v2;

public class House {


    public static int getHouse()
    {
        int house;

        house = (int)(Math.random() * 5 + 16);                         // ensures the house cannot generate more than 20, so that it is possible to win

        return house;
    }

}
