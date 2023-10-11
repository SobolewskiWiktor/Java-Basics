import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.print("Hello and welcome!");
       System.out.print("Hello ! Type some numbers to create a triangle \n");

       System.out.print("First: ");
       String aS = reader.readLine();
       double a = Double.valueOf(aS);

       System.out.print("Second: ");
       String bS = reader.readLine();
       double b = Double.valueOf(bS);

       System.out.print("Third: ");
       String cS = reader.readLine();
       double c = Double.valueOf(cS);


       int ifBuild = 0;
       if( c > (a+b)) {
           ifBuild = 1;
       } else if(b>(a+c)){
            ifBuild = 1;
        } else if (a > (b+c)) {
          ifBuild = 1;
        }

       if(ifBuild == 1)
       {
           Triangle my = new Triangle(a , b , c);

           while(true)
           {
               System.out.print("=== MENU ===\n");
               System.out.print("1. Field\n");
               System.out.print("2. circuit\n");
               System.out.print("3. type\n");
               System.out.print("4. exit\n");
               System.out.print("===============\n");
               System.out.print("Choice: ");
               String choisceS = reader.readLine();
               int choice = Integer.valueOf(cS);

               switch(choice)
               {
                   case 1: { my.heron(); break;}
                   case 2: { }
               }

           }
       }
    }
}