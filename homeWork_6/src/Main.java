// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testy
        String czasString = "12:30:45";
        String dataString = "2001-10-14";
        LocalTime godzinaUrodzin = LocalTime.parse(czasString);
        LocalDate data = LocalDate.parse(dataString);

        Person maciek = new Person("Maciej", "Kowalski", godzinaUrodzin, data);

        maciek.getAge();
        maciek.getGender();
        maciek.getDayOfBirth();
        maciek.timeWhileBirthInLA();
        maciek.reverseNameAndSurname();
        System.out.println("Koniec testu");
        System.out.println("****************************************************************");
        //aplikacja
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj imię:");
        String name = scanner.nextLine();

        if (isAlphabetic(name)) {
            System.out.println("Wprowadzono poprawne imię: " + name);
        } else {
            System.out.println("Niepoprawne dane. Podaj tylko litery.");
        }

        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();

        System.out.println("Podaj godzinę urodzin w formacie HH:mm:");
        String timeInput = scanner.nextLine();
        LocalTime timeOfBirth = LocalTime.parse(timeInput);

        System.out.println("Podaj datę urodzin w formacie RRRR-MM-DD:");
        String dateInput = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateInput);

        Person testowyAplikacyjny = new Person(name, surname, timeOfBirth, dateOfBirth);

        testowyAplikacyjny.getAge();
        testowyAplikacyjny.getGender();
        testowyAplikacyjny.getDayOfBirth();
        testowyAplikacyjny.timeWhileBirthInLA();
        testowyAplikacyjny.reverseNameAndSurname();

        scanner.close();
        private static boolean isAlphabetic(String input) {
            return input.matches("[a-zA-Z]+");
        }


    }
}