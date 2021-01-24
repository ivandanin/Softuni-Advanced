import java.io.*;

public class AllCapitals {
    public static void main(String[] args)throws IOException {

        String inputPath = "C:\\input.txt";

        String outputPath = "C:\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(outputPath);


        String input = reader.readLine();
        while (input != null) {
            input = input.toUpperCase();
            for (char symbol : input.toCharArray()) {

            writer.write(symbol);
            }
            writer.println();

            input = reader.readLine();

        }
        writer.close();
    }
}
