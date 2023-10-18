public class Main {
    public static void main(String[] args) {
         Bicycle rower = new Bicycle(4,4,1);
         MountainBike rowerG = new MountainBike(5,5,1,1);

         rowerG.setGear(5);

         System.out.print("Bieg roweru Górskiego: " + rowerG.gear + "\n");
         System.out.print("Czy rower jest górski? :");
         System.out.print(rower instanceof  MountainBike);
         System.out.print("\n");
         //System.out.printf("Hello and welcome!");

         //rowerG.speedUp(2);
         //rowerG.speedUp(2);
         //rowerG.speedUp(2);
         //rowerG.speedUp(2);
         //rowerG.speedUp(2);
         //rowerG.speedUp(2);

         for(int i=0; i<20; i++)
         {
             rowerG.run();
         }
         rowerG.stop();
        }
    }
