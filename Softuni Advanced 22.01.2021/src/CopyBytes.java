import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {

        String inputPath = "C:\\input.txt";
        String outputPath = "C:\\output.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)){

            int oneByte;
            while ((oneByte = inputStream.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    outputStream.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
