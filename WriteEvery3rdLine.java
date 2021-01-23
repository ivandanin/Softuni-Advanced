import java.io.*;

public class WriteEvery3rdLine {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\output.txt"));

        String line = reader.readLine();
        int lineNumber = 1;

        while (line != null) {
            lineNumber++;
            line = reader.readLine();

            if (lineNumber % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();
    }
}
