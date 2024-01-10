import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileOperations {
    public static void operations() {
        try {
            Path dir32 = Paths.get("Dir32");
            Files.createDirectories(dir32);
            Path file1 = Paths.get("Dir0/Dir1/Dir11/File1.txt");
            Path copiedFile1 = dir32.resolve("File1.txt");
            Files.copy(file1, copiedFile1, StandardCopyOption.REPLACE_EXISTING);

            Path file2 = Paths.get("Dir0/Dir1/Dir11/File2.txt");
            String content = new String(Files.readAllBytes(file1), StandardCharsets.UTF_8);
            content = content.replace('a', '@');
            Files.write(file2, content.getBytes(StandardCharsets.UTF_8));

            Path file3 = Paths.get("Dir0/Dir1/Dir11/File3.txt");
            List<String> lines = Files.readAllLines(file1, StandardCharsets.UTF_8);
            Files.write(file3, lines);

            Path file4 = Paths.get("Dir0/Dir2/File4.txt");
            Files.copy(file1, file4, StandardCopyOption.REPLACE_EXISTING);
            byte[] file4Content = Files.readAllBytes(file4);
            for (int i = 0; i < file4Content.length; i += 2) {
                file4Content[i] = (byte) ' ';
            }
            Files.write(file4, file4Content);

            printDirectoryContents(Paths.get("Dir0"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printDirectoryContents(Path dir) throws IOException {
        Files.walk(dir)
                .filter(Files::isRegularFile)
                .forEach(path -> {
                    try {
                        System.out.println(path + " - " + Files.size(path) + " bytes");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
