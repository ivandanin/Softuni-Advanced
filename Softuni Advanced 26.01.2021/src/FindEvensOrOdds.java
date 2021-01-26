import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int start = input[0];
        int end = input[1];

        String evenOrOdd = scanner.nextLine();
        Predicate<Integer> isEven = num -> num % 2 == 0;

        for (int i = start; i <= end; i++) {
            if (evenOrOdd.equals("even")) {
                if (isEven.test(i)){
                    System.out.print(i + " ");
                }
            } else if (evenOrOdd.equals("odd")) {
                if (!isEven.test(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
