import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> findMin = num -> {
            int min = Integer.MAX_VALUE;

            for (int i : num) {
            if (i < min) {
                min = i;
            }
            }
            return min;
        };
        System.out.println(findMin.apply(input));
    }
}
