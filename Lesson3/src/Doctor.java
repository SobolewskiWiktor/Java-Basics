

public class Doctor extends MedicalStaff {

    public String specjalization;

    public Doctor(String name, int pesel, int ID, int number, String newSpecjalization)
    {
        super(name, pesel, ID, number);
        this.specjalization = newSpecjalization;
    }
    public void makeOperation(Patient p)
    {
        System.out.print("Make operation on: "+ p.name);
    }
}
