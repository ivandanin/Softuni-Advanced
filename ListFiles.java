import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users";

        File file = new File(fileName);

        File[] innerFiles = file.listFiles();

        for (File innerFile : innerFiles) {
            if (!innerFile.isDirectory()) {
                System.out.printf("%s: [%d]%n", innerFile.getName(), innerFile.length());
            }
        }
    }
}
