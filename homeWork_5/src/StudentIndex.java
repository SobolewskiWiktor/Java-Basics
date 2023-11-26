import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class StudentIndex  {
    Console c = System.console();
    public String surname;
    public int numberOfSubjects;
    public int[] marks;

    public StudentIndex(String newSurname, int newNumberOfSubjects)
    {
        surname = newSurname;
        numberOfSubjects = newNumberOfSubjects;
        marks = new int[newNumberOfSubjects];
    }

    public void getMarks() throws IOException
    {
        for(int i=0; i<numberOfSubjects; i++)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Scor number: "+i+" : ");
            String tempMarkString = reader.readLine();
            int tempMark = Integer.valueOf(tempMarkString);
            marks[i] = tempMark;
        }

    }

    static String checkGrades(int grade) throws Exception
    {
        switch(grade)
        {
            case 2:
                return "Niedostateczny";
            case 3:
                return "Dostateczny";
            case 4:
                return "Dobry";
            case 5:
                return "Bardzo dobry";
            default:
                throw new Exception("Podana ocena jest nie prarawidłowa");
        }
    }
    public void printMarks ()
    {
        System.out.print("Student: "+ surname + "\n");

        for(int i=0; i<numberOfSubjects; i++) {
            System.out.print("Subject nr: "+i+" : ");
            switch(marks[i])
            {
                case 2:
                    System.out.print("Niedostateczny \n");
                    break;
                case 3:
                    System.out.print("Dostateczny \n");
                    break;
                case 4:
                    System.out.print("Dobry \n");
                    break;
                case 5:
                    System.out.print("Bardzo Dobry \n");
                    break;
            }
        }
    }

    public void getHighermark()
    {
        Arrays.sort(marks);
        int higestMark = marks[numberOfSubjects -1];
        System.out.print("The higest mark is " + higestMark + "\n");
    }

    public void getSubjctWithNoMark()
    {
        if(numberOfSubjects == marks.length)
        {
            System.out.print("all subjects have mark");
        }
        else
        {
            int noMark = numberOfSubjects - marks.length;
            System.out.print("Stundet dont have mark in: "+ noMark + " Subjects \n");
        }
    }

    void addGrades(float... grades) {
        int[] oldGrades = new int [this.marks.length];
        oldGrades = this.marks;
        int[] newGrades = new int [ this.marks.length + grades.length ];

       for(int i=0; i<grades.length; i++)
       {
           try
           {
               checkGrades((int)grades[i]);
               newGrades[this.marks.length + i] = (int)grades[i];
           }catch (Exception e)
           {
               break;
           }
       }

       for(int i=0; i<this.marks.length; i++)
       {
           newGrades[i] = this.marks[i];
       }

       this.marks = newGrades;
       System.out.println(Arrays.toString(this.marks));
    }

    float calculateMean()
    {
        float mean = 0;
        for(int i=0; i<this.marks.length; i++)
        {
            mean = mean + this.marks[i];
        }
        mean = mean / this.marks.length;
        System.out.print("Srednia to: "+ mean+"/n");
        return mean;
    }
}