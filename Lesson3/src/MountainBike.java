public class MountainBike  extends Bicycle implements Vehicle{
    public int seatHeight;

    public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight)
    {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    @Override
    public void speedUp (int increment)
    {
        System.out.print("Speed up \n");
        this.speed += increment;
        System.out.print("Speed  "+ this.speed + " \n");

    }

    @Override
    public void run() {
        System.out.print("Curenttly running \n");
    }

    @Override
    public void stop() {
        System.out.print("Stopping \n");
    }
}
