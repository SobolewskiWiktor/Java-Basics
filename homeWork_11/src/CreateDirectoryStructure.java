import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryStructure {
    public static void main(String[] args) {
        try {
            // Tworzenie Dir0
            Path dir0 = Paths.get("Dir0");
            Files.createDirectories(dir0);

            // Tworzenie Dir1
            Path dir1 = dir0.resolve("Dir1");
            Files.createDirectories(dir1);

            // Tworzenie Dir11
            Path dir11 = dir1.resolve("Dir11");
            Files.createDirectories(dir11);

            // Tworzenie File1.txt i File2.txt w Dir11
            Files.createFile(dir11.resolve("File1.txt"));
            Files.createFile(dir11.resolve("File2.txt"));

            // Tworzenie Dir111
            Path dir111 = dir11.resolve("Dir111");
            Files.createDirectories(dir111);

            // Tworzenie File3.txt w Dir111
            Files.createFile(dir111.resolve("File3.txt"));

            // Tworzenie Dir2
            Path dir2 = dir0.resolve("Dir2");
            Files.createDirectories(dir2);

            // Tworzenie File4.txt w Dir2
            Files.createFile(dir2.resolve("File4.txt"));

            // Tworzenie Dir3
            Path dir3 = dir0.resolve("Dir3");
            Files.createDirectories(dir3);

            // Tworzenie Dir31
            Path dir31 = dir3.resolve("Dir31");
            Files.createDirectories(dir31);

            // Tworzenie File5.txt w Dir31
            Files.createFile(dir31.resolve("File5.txt"));

        } catch (FileAlreadyExistsException e) {
            System.err.println("Plik lub katalog już istnieje");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
