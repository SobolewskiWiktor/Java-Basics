import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class student implements Runnable {
    private String name;
    private int correctAnswers;

    public student(String name) {
        this.name = name;
        this.correctAnswers = 0;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            boolean isCorrect = random.nextBoolean();
            if (isCorrect) {
                correctAnswers++;
            }

            System.out.println(name + " odpowiada na pytanie " + (i + 1) + ": " + (isCorrect ? "poprawnie" : "niepoprawnie"));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(21); // 20 studentów + 1 prowadzący
        ArrayList<student> students = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            students.add(new student("Student " + i));
        }
        student instructor = new student("Prowadzący");
        for (student student : students) {
            executorService.execute(student);
        }
        executorService.execute(instructor);
        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            System.out.println("\nWyniki:");
            Collections.sort(students, (s1, s2) -> Integer.compare(s2.getCorrectAnswers(), s1.getCorrectAnswers()));

            for (student student : students) {
                System.out.println(student.getName() + ": " + student.getCorrectAnswers() + " poprawnych odpowiedzi");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
