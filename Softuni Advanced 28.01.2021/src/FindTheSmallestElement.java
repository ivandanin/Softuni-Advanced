import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Function<List<Integer>, Integer> function = nums -> {
            int min = Integer.MAX_VALUE;
            for (Integer num : nums) {
              if (num <= min) {
                  min = num;
              }
            }
            return nums.lastIndexOf(min);
        };

        System.out.println(function.apply(numbers));
    }
}
