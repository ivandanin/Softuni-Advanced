import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\input.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        FileWriter writer = new FileWriter("C:\\output.txt");

          while (scanner.hasNext()) {
              if (scanner.hasNextInt()) {
                  int number = scanner.nextInt();
                  writer.write(String.valueOf(number));
                  writer.write(System.lineSeparator());
              }
                  scanner.next();
              }
              writer.flush();
              writer.close();
      }
    }

