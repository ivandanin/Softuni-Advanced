import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], int[]> add = numbers -> Arrays.stream(numbers).map(e -> e += 1).toArray();
        Function<int[], int[]> multiply = numbers -> Arrays.stream(numbers).map(e -> e *= 2).toArray();
        Function<int[], int[]> subtract = numbers -> Arrays.stream(numbers). map(e -> e -= 1).toArray();
        Consumer<int[]> consumer = numbers -> {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        };

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command){
                case "add":
                numbers = add.apply(numbers);
                    break;
                case "multiply":
                numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                numbers = subtract.apply(numbers);
                    break;
                case "print":
                    consumer.accept(numbers);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
