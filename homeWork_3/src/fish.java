public class fish extends Animal{
    @Override
    public void whoAmI() {
        super.whoAmI();
        System.out.println("My species is Bird");
    }

    public void swim()
    {
        System.out.println("Hey I'm swimming");
    }
}
