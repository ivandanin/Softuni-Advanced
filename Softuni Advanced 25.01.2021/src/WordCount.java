import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args)throws IOException {

        LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap<>();
        List<String> lines = Files.readAllLines(Path.of("C:\\words.txt"));
        List<String> searchedLines = Files.readAllLines(Path.of("C:\\text.txt"));

        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsCount.put(word, 0);
            }
        }

        for (String line : searchedLines) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> {
                        if (wordsCount.containsKey(word)) {
                            wordsCount.put(word, wordsCount.get(word) + 1);
                        }
                    }
            );
        }

        PrintWriter writer = new PrintWriter("C:\\results.txt");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            writer.println(entry.getKey() + " - " + entry.getValue());
        }
        writer.close();
    }
}
