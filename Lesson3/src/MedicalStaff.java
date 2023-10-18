public class MedicalStaff extends Staff{
    public int PerrmisionNumber;

    public MedicalStaff(String Name, int Pesel, int ID, int newPerrmisionNumber)
    {
        super(Name, Pesel, ID);
        this.PerrmisionNumber = newPerrmisionNumber;
    }
}
