import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Devider div = new Devider();
        try {
            div.cloneDevider();
            System.out.println("test");
        }
        catch(CloneNotSupportedException e) {
            System.err.println("Exeption");
        }
        System.out.println(div.run(9, 3) + "\n");*/

        pupil student = new pupil("test", "test", 1 );
        while(true)
        {
            System.out.println("=====MENU=====");
            System.out.println("1. Avarage");
            System.out.println("2. Print");
            System.out.println("3. Print Grade");
            System.out.println("4. Get Grade");
            System.out.println("5. Exit");
            System.out.println("================");
            System.out.print("Choice: ");
            String stringChoice = scan.nextLine();
            int choice = Integer.valueOf(stringChoice);

            switch(choice) {
                case 1:
                  student.avarage();
                  break;
                case 2:
                    student.printMarks();
                    break;
                case 3:
                    break;
                case 4:
                    student.getMarks();
                    break;
                case 5:
                    return; 
            }


        }
    }
}