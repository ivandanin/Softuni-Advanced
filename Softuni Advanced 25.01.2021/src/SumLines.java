import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));

        String line = reader.readLine();

        while (line != null) {
        int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }

            System.out.println(sum);
            line = reader.readLine();
        }

    }
}
