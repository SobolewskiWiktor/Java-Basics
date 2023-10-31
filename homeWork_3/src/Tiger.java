public class Tiger extends Mammal implements Carnivorous{

    public Tiger(String name, int age, int weight, int numberOfLegs)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public void hunt()
    {
        System.out.println("Hey I'm Hunting");
    }
}
