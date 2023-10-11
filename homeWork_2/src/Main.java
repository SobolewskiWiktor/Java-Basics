import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Surname: ");
            String surname = reader.readLine();
            System.out.print("Subejcts: ");
            String numberOfSubjectsString = reader.readLine();
        int numberOfSubjects = Integer.valueOf(numberOfSubjectsString);

        StudentIndex first = new StudentIndex(surname, numberOfSubjects);

        first.getMarks();
        first.getHighermark();
        first.printMarks();
        first.getSubjctWithNoMark();
    }
}