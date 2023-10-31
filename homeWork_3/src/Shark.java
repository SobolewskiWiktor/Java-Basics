public class Shark extends fish implements Carnivorous{

    public Shark (String name, int age, int weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    public void hunt()
    {
        System.out.println("Hey i'm Hunting");
    }
}
