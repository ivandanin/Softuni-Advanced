import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharsTypes {
    public static void main(String[] args)throws IOException {

        String inputPath = "C:\\input.txt";

        String outputPath = "C:\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(outputPath);

        String input = reader.readLine();
        int vowels = 0;
        int consonants = 0;
        int punctuations = 0;

        while (input != null) {
            for (char symbol : input.toCharArray()) {
                switch (symbol) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                        break;
                    case '!':
                    case '?':
                    case '.':
                    case ',':
                        punctuations++;
                        break;
                    default:
                        if (symbol != ' ') {
                            consonants++;
                        }
                        break;
                }
            }

            input = reader.readLine();
        }
        writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowels, consonants, punctuations);
        writer.close();
    }
}
