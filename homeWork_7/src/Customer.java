import java.util.ArrayList;

public class Customer {
    public String name;
    public int countMeals;
    public Double price = 0.0;
    public ArrayList<String> Meals = new ArrayList<>();

    public Customer(String name)
    {
        this.name = name;
    }


    public void addMeal (Meals meal)
    {
        this.Meals.add(meal.name);
        this.price = this.price + meal.price;
    }

    public void checkMeal (String name)
    {
        int counter = 0;
        for(String elem : this.Meals)
        {
            if(elem == name)
            {
                counter = counter + 1;
            }
        }

        if(counter > 0)
        {
            System.out.println("Klient wybrał to danie: "+counter+" razy.");
        }
        else
        {
            System.out.println("Klient nie wybrał takiego dania");
        }
    }

    public void countMeals()
    {
        int counter = 0;
        counter = this.Meals.size();
        System.out.println("Klient wybrał: "+counter);
    }

    public void getPrice()
    {
        System.out.println("Klient zapłaci: "+this.price);
    }

}
