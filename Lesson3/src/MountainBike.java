public class MountainBike  extends Bicycle{
    public int seatHeight;

    public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight)
    {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }
}
