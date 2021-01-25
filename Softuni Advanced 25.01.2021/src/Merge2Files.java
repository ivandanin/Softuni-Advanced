import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Merge2Files {
    public static void main(String[] args)throws IOException {

        List<String> file1 = Files.readAllLines(Path.of("C:\\inputOne.txt"));
        List<String> file2 = Files.readAllLines(Path.of("C:\\inputTwo.txt"));

        List<String> finalFile = new LinkedList<>();

        finalFile.addAll(file1);
        finalFile.addAll(file2);

        PrintWriter writer = new PrintWriter("C:\\results.txt");

        finalFile.forEach(writer::println);
        writer.close();
    }
}
