import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        Predicate<String> lenghtCheck = name -> {
            if (name.toString().length() <= n) {
                System.out.println(name);
            }
            return false;
        };
        for (String name : input) {
            lenghtCheck.test(name);
        }
    }
}
