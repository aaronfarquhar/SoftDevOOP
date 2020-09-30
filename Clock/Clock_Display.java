package Clock;

public class Clock_Display {

    int limit;
    int Value;

    /**
     * Constructor for the clock Display - sets the limit for display rollover i.e at a set value that the display rolls over to zero
     * @param rollOverLimit
     */
    public Clock_Display(int rollOverLimit)
    {

        limit = rollOverLimit;

        Value = 0;


    }

    public int getValue()
    {

        return Value;
    }


    public String getDisplayValue()
    {
        if (Value < 10)
        {
            return "0" + Value;
        }
        else
            return "" + Value;
    }

    public void setValue(int replacementValue)
    {
        if ((replacementValue >= 0) && (replacementValue < limit))
        {
            Value = replacementValue;
        }
    }

    public void increment()
    {

        Value = (Value + 1) % limit;
    }
}
