import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Path dir = Paths.get("C:/Users/Miguel/Desktop/codigos/Aulas/Java/Java/src");
        Path file = Paths.get("C:/Users/Miguel/Desktop/codigos/Aulas/Java/Java/src/Ant.java");

        if (Files.isDirectory(dir))
            System.out.println("dir exists");
        else
            System.out.println("dir not exists");

        if (Files.exists(file))
            System.out.println("file exists");
        else
            System.out.println("file not exists");

        List<String> lines = Files.readAllLines(file);

        lines.forEach((line) -> System.out.println(line));

    }
}
