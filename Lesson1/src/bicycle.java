public class bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public bicycle(int startCadence, int startGear, int startSpeed)
    {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    public void applayBreak(int decrement)
    {
        speed = speed - decrement;
    }

    public void speedUp(int increment)
    {
        speed = speed + increment;
    }

    public void serCadence(int newCadence)
    {
        cadence = newCadence;
    }

    public void setGear(int newGear)
    {
        gear = newGear;
    }
}
