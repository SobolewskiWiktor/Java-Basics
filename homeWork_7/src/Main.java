<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Map<String, Double> dania = new HashMap<>();
       dania.put("Zupa pomidorowa", 4.0);
       dania.put("Krupnik", 4.0);
       dania.put("Gulasz", 9.0);
       dania.put("Pierogi", 9.5);
       dania.put("Rolada z kurczaka", 9.0);
       dania.put("Zieminaki", 4.0);
       dania.put("Kasza gruczana", 3.5);
       dania.put("Buraki", 4.0);
       dania.put("Sernik", 6.0);

       Meals danie1 = new Meals(dania.get("Krupnik"),"Krupnik");
       Customer maciek = new Customer("Maciek");

       maciek.addMeal(danie1);
       Meals danie2 = new Meals(dania.get("Pierogi"),"Pierogi");
       maciek.addMeal(danie2);
       maciek.getPrice();
       maciek.countMeals();
       maciek.checkMeal("Krupnik");
       maciek.checkMeal("Buraki");

=======

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        class Car
        {
            public String manufacture;
            public String model;
            public int kilometers;
            public int price;
        }
=======
       System.out.printf("Hello World");
>>>>>>> 28e9f209ec82b298f7269a6aa82df4444902b809
>>>>>>> 212121c739d6bae919a81d3d6bef40aff9903922
    }
}