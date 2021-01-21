import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> nameList = new LinkedHashSet<>();

        while (n-- > 0) {
            String name = scanner.nextLine();
            nameList.add(name);
        }
        for (String names : nameList) {
            System.out.println(names);
        }
    }
}
