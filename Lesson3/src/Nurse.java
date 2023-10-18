public class Nurse extends MedicalStaff{

    public Nurse(String name, int pesel, int id, int number)
    {
        super(name, pesel, id, number);
    }
    public void makeInjection(Patient p)
    {
        System.out.print("make injection to: "+ p.name);
    }

}
