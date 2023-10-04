public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        bicycle rower = new bicycle(10,5,5);
        System.out.println("C "+rower.cadence+" G "+rower.gear+" S "+rower.speed);

        rower.setGear(6);
        rower.speedUp(15);

        System.out.println("C "+rower.cadence+" G "+rower.gear+" S "+rower.speed);
         

        rower.applayBreak(15);
        rower.setGear(1);

        System.out.println("C "+rower.cadence+" G "+rower.gear+" S "+rower.speed);

    }

}