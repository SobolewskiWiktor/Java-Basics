public class Main {
    public static void main(String[] args) {

        /*bicycle myBicycle = new bicycle(10,5,5);
        System.out.println("C "+myBicycle.cadence+" G "+myBicycle.gear+" S "+myBicycle.speed);

        myBicycle.setGear(6);
        myBicycle.speedUp(15);

        System.out.println("C "+myBicycle.cadence+" G "+myBicycle.gear+" S "+myBicycle.speed);
         

        myBicycle.applayBreak(15);
        myBicycle.setGear(1);

        System.out.println("C "+myBicycle.cadence+" G "+myBicycle.gear+" S "+myBicycle.speed);*/

        tv television = new tv("Samusng Led", 10); 
        
        television.setState(1);
        television.changeChannel("BBC");
        television.changeVolume(15);

        System.out.println("State: "+television.state+" Channel: "+television.channel+" volume: "+television.volume);
        


    }

}