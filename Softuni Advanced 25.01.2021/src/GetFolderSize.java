import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class GetFolderSize {
    public static void main(String[] args)throws IOException {

        String folder = "C:\\Exercises Resources";

        long size = 0;
        File file = new File(folder);
        for (File aFile : Objects.requireNonNull(file.listFiles())) {
            size += aFile.length();
        }

        System.out.printf("Folder size: %d", size);
    }
}
