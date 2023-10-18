public class Staff extends Person{
    public int staffID;

    public Staff(String newName, int newPesel, int newID)
    {
        super(newName, newPesel);
        this.staffID = newID;
    }
}
