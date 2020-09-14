package Pontoon_OOP;

public class House {


    public static int getHouse()
    {
        int house;

        house = (int)(Math.random() * 6 + 16);                         //* 20 ensures the house cannot generate more than 20, so that it is possible to win

        return house;
    }

}
