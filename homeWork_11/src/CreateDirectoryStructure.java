import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryStructure {
    public static void create() {
        try {
            Path dir0 = Paths.get("Dir0");
            Files.createDirectories(dir0);

            Path dir1 = dir0.resolve("Dir1");
            Files.createDirectories(dir1);

            Path dir11 = dir1.resolve("Dir11");
            Files.createDirectories(dir11);

            Files.createFile(dir11.resolve("File1.txt"));
            Files.createFile(dir11.resolve("File2.txt"));

            Path dir111 = dir11.resolve("Dir111");
            Files.createDirectories(dir111);

            Files.createFile(dir111.resolve("File3.txt"));

            Path dir2 = dir0.resolve("Dir2");
            Files.createDirectories(dir2);

            Files.createFile(dir2.resolve("File4.txt"));

            Path dir3 = dir0.resolve("Dir3");
            Files.createDirectories(dir3);

            Path dir31 = dir3.resolve("Dir31");
            Files.createDirectories(dir31);
            
            Files.createFile(dir31.resolve("File5.txt"));

        } catch (FileAlreadyExistsException e) {
            System.err.println("Plik lub katalog już istnieje");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
