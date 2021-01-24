import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args)throws IOException {

        String toReadFrom = "C:\\Users\\ivand\\IdeaProjects\\Softuni Advanced " +
                "25.01.2021\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        String compareWith = "C:\\Users\\ivand\\IdeaProjects\\Softuni Advanced " +
                "25.01.2021\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        String writeTo = "C:\\Users\\ivand\\IdeaProjects\\Softuni Advanced " +
                "25.01.2021\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";

        BufferedReader firstFile = new BufferedReader(new FileReader(toReadFrom));
        BufferedReader secondFile = new BufferedReader(new FileReader(compareWith));




    }
}
