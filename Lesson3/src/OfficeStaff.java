public class OfficeStaff extends Staff{

    public OfficeStaff(String name, int pesel, int id)
    {
        super(name, pesel, id);
    }

    public void print()
    {
        System.out.print("Hi \n");
        System.out.print("My name is: " + name);
        System.out.print("I'm office staff");
    }

}
