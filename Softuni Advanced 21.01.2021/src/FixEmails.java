import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> collection = new LinkedHashMap<>();

        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!collection.containsKey(name)) {
                    collection.put(name, email);

            }
            if (email.endsWith(".us") || email.endsWith(".uk") || email.endsWith(".com")) {
                collection.remove(name, email);
            }

            name = scanner.nextLine();
        }
        collection.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
