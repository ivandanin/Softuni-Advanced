import java.io.*;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args)throws IOException {

        String inputPath = "C:\\inputLineNumbers.txt";

        String outputPath = "C:\\output.txt";

        Scanner scanner = new Scanner(new File(inputPath));
        PrintStream output = new PrintStream(new File(outputPath));

        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.trim();
            if (line.length() > 0) {
                output.println(lineNumber + ". " + line);
                ++lineNumber;
            }
        }
    }
}
