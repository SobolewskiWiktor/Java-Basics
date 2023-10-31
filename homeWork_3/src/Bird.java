public class Bird extends Animal{
    @Override
    public void whoAmI()
    {
        System.out.println("My name is "+ this.name);
        System.out.println("My age is "+ this.age);
        System.out.println("My weight is" + this.weight);
        System.out.println("My species is Bird");
    }

    public void fly () {
        System.out.println("Hey I'm flying");
    }
}
