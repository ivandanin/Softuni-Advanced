import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], String> getCount =
                arr -> String.format("Count = %d", arr.length);

        System.out.println(getCount.apply(input));

        Function<int[], String> getSum =
                arr -> {
                   return "Sum = " + Arrays.stream(arr).sum();
                    };

        System.out.println(getSum.apply(input));
                }
    }

