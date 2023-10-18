public class Patient extends Person{
    public int patientID;

    public Patient(String newName, int newPesel, int newID)
    {
        super(newName, newPesel);
        this.patientID = newID;
    }
}
