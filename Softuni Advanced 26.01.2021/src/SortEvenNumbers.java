import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

               String output = Arrays.stream(input)
                .mapToInt(e -> Integer.parseInt(e))
                       .filter(num -> num % 2 == 0)
                       .mapToObj(e -> String.valueOf(e))
                       .collect(Collectors.joining(", "));

        System.out.println(output);

       output = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
