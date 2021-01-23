import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String command = scanner.nextLine();

            while (!command.equals("search")) {
                String[] input = command.split("-");
                String name = input[0];
                String phoneNumber = input[1];

                phonebook.put(name, phoneNumber);
                command = scanner.nextLine();
            }
                String nameSearcher = scanner.nextLine();
            while (!nameSearcher.equals("stop")) {
                if (!phonebook.containsKey(nameSearcher)) {
                    System.out.printf("Contact %s does not exist.%n", nameSearcher);
                } else if (phonebook.containsKey(nameSearcher)) {
                        System.out.printf("%s -> %s%n", nameSearcher, phonebook.get(nameSearcher));

                }
                nameSearcher = scanner.nextLine();
        }
    }
}
