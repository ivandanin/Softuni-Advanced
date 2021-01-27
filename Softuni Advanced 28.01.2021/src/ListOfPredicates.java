import java.util.*;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Set<Integer> divisible = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            if (i % numbers.get(numbers.size() - 1) == 0) {
                divisible.add(i);
        }
        }
        divisible.forEach(e -> System.out.print(e + " "));
    }
}
