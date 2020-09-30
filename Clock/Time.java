package Clock;

/**
 * @author AJFaz
 * @version 1.0
 *
 */


public class Time {

    private Clock_Display hour;
    private Clock_Display minute;


    private String displayClockString;


    public  Time()
    {
        hour = new Clock_Display(24);
        minute = new Clock_Display(60);

        updateDisplay();
    }


    public  Time(int hours, int minutes)
    {
        hour = new Clock_Display(24);
        minute = new Clock_Display(60);


        setTime(hours, minutes);
    }

    public void tick()
    {
        minute.increment();

        if (minute.getValue() == 0)
        {
            hour.increment();
        }

        updateDisplay();
    }

    public void setTime(int hours, int minutes)
    {
        hour.setValue(hours);
        minute.setValue(minutes);

        updateDisplay();
    }

    public String getTime() {
        return displayClockString;
    }

    private void updateDisplay() {
        displayClockString = hour.getDisplayValue() + ":" + minute.getDisplayValue();
        System.out.println(displayClockString);
    }







}
