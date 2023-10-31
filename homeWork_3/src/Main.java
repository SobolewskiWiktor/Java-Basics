public class Main {
    public static void main(String[] args) {
        Elephant Maciek = new Elephant("Maciek", 2 , 200, 4);
        Tiger Mirek = new Tiger("Mirek", 10, 150, 4);
        Sparrow Ania = new Sparrow("Ania", 4, 20);
        Owl Michal = new Owl("Michal", 1, 15);
        Crucian Agnieszka = new Crucian("Agnieszka", 2, 30);
        Shark Mariusz = new Shark("Mariusz", 4, 250);

        Maciek.whoAmI();
        Maciek.eat();
        Maciek.sleep();
        Maciek.walk();

        Mirek.whoAmI();
        Mirek.eat();
        Mirek.sleep();
        Mirek.walk();
        Mirek.hunt();

        Ania.whoAmI();
        Ania.fly();
        Ania.eat();
        Ania.sleep();

        Michal.whoAmI();
        Michal.fly();
        Michal.eat();
        Michal.sleep();
        Michal.hunt();

        Agnieszka.whoAmI();
        Agnieszka.eat();
        Agnieszka.sleep();
        Agnieszka.swim();

        Mariusz.whoAmI();
        Mariusz.eat();
        Mariusz.sleep();
        Mariusz.swim();
        Mariusz.hunt();

    }
}