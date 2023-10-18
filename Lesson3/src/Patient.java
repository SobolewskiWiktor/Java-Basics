public class Patient extends Person{
    public int patientID;

    public Patient(String newName, int newPesel, int newID)
    {
        super(newName, newPesel);
        this.patientID = newID;
    }

    public void print()
    {
        System.out.print("Hi \n");
        System.out.print("My name is: " + name);
        System.out.print("I'm a patient");


    }
}
