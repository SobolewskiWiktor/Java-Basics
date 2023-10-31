public class Animal {
    public int weight;
    public int age;
    public String name;

    public void eat(){
     System.out.println("Hey I'm eating");
    }
    public void sleep(){
        System.out.println("Hey I'm sleeping");
    }

    public void whoAmI() {
        System.out.println("My name is "+ this.name);
        System.out.println("My age is "+ this.age);
        System.out.println("My weight is" + this.weight);
    }
}
