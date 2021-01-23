import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\input.txt";

        List<String> lines = Files.readAllLines(Path.of(inputPath))
                .stream().sorted(String::compareTo).collect(Collectors.toList());

        Files.write(Path.of("C:\\output.txt"), lines, Charset.defaultCharset());
    }
}
