package Pontoon_V3_Inheritance;

public enum values
{

    ACE (1),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    JACK (10),
    KING (10),
    QUEEN (10);

    private int numberValue;

    values(int numberValue)
    {
        this.numberValue = numberValue;
    }

    public int getNumberValue()
    {
        return numberValue;
    }
}


