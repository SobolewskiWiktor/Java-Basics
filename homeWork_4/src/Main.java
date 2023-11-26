import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę z przedziału 0.1-9999.99:");
        try {
            double number = scanner.nextDouble();

            if (number < 0.1 || number > 9999.99) {
                throw new IllegalArgumentException("Number is out of the given range.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("Pierwiastek z podanej liczby: " + squareRoot);

        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

