import java.util.Scanner;
public class pupil {
    Scanner scan = new Scanner(System.in);


    String name;
    String surname;
    int numberOfMarks;
    int[] Marks;

    public pupil(String newName, String newSurname, int newNumberOfmarks)
    {
        this.name = newName;
        this.surname = newSurname;
        this.numberOfMarks = newNumberOfmarks;
    }

    public void printMarks()
    {
        for(int i=0; i<this.numberOfMarks; i++)
        {
            System.out.println("Mark "+i+" / "+this.numberOfMarks +" "+Marks[i]);
        }
    }

    public void getMarks()
    {
        for(int i=0; i<this.numberOfMarks; i++)
        {
            System.out.print("mark number | "+ i +" / "+ this.numberOfMarks +" : ");
            String stringTempMark = scan.nextLine();
            int tempMark = Integer.valueOf(stringTempMark);
            Marks[i] = tempMark;

        }
    }

    public void avarage (){
        int coutAverage = 0;
        int sumMarks =0;
        for(int i=0; i<this.numberOfMarks; i++)
        {
            sumMarks =+ Marks[i];
        }
        coutAverage = sumMarks / numberOfMarks;

        System.out.println("Average of marks is : "+ coutAverage);
    }

}
