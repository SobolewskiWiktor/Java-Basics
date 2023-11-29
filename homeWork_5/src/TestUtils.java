import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtils {

    public static String getSystemOut(Runnable action) {
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            action.run();
            return outContent.toString();
        } finally {
            System.setOut(originalOut);
        }
    }
}