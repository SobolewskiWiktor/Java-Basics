public class Owl extends Bird implements Carnivorous{

    public Owl (String name, int age, int weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    public void hunt()
    {
        System.out.println("Hey i'm hunting");
    }
}
