import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Person {
    private String name;
    private String Surname;
    private LocalTime timeOfBirth;
    private LocalDate dateOfBirth;

    public Person(String name, String Surname, LocalTime timeOfBirth, LocalDate date)
    {
        this.name = name;
        this.Surname = Surname;
        this.timeOfBirth = timeOfBirth;
        this.dateOfBirth = date;
    }

    public String getDayOfBirth()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");
        String dayOfMonthInWords = this.dateOfBirth.format(formatter);
        System.out.println("Urodzony w: "+ dayOfMonthInWords);
        return dayOfMonthInWords;
    }

    public String getGender()
    {
        if(this.name.charAt(this.name.length() - 1) == 'A' || this.name.charAt(this.name.length() - 1) == 'a')
        {
            System.out.println("Kobieta");
            return "kobieta";
        }
        else
        {
            System.out.println("mężczyzna");
            return "mężczyzna";
        }
    }

    public long getAge()
    {
        LocalDate now = LocalDate.now();
        long years = ChronoUnit.YEARS.between(this.dateOfBirth, now);
        System.out.println("Wiek: "+years);
        return years;
    }

    public String reverseNameAndSurname()
    {
        String reverseName = new String();
        int length = this.name.length() -1;
        for(int i=0; i<this.name.length(); i++)
        {
            reverseName += this.name.charAt(length - i);
        }


        String reverseSurname = new String();
        length = this.Surname.length() -1;
        for(int i=0; i<this.Surname.length(); i++)
        {
          reverseSurname += this.Surname.charAt(length - i);
        }

        String reverseNameSurname = reverseName + " " +reverseSurname;
        System.out.println("Na odwrót to: "+ reverseNameSurname);
        return reverseNameSurname;
    }

    public String timeWhileBirthInLA()
    {
        LocalDateTime dateTimeOfBirth = LocalDateTime.of(dateOfBirth, timeOfBirth);
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = dateTimeOfBirth.atZone(losAngelesZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTimeInLA = zonedDateTime.format(formatter);
        System.out.println("Czas w la podczas urodzin to: "+ formattedTimeInLA);
        return formattedTimeInLA;
    }
    // Gettery
    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public LocalTime getTimeOfBirth() {
        return timeOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Settery
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public void setTimeOfBirth(LocalTime timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
