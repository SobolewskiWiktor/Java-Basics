public class Mammal  extends Animal{
    public int numberOfLegs;

    public void walk ()
    {
        System.out.println("Hey I'm walking");
    }
    @Override
    public void whoAmI()
    {
        System.out.println("My name is "+ this.name);
        System.out.println("My age is "+ this.age);
        System.out.println("My weight is" + this.weight);
        System.out.println("My species is Mammal");
    }
}
