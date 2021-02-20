import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                ArrayDeque<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> second = new ArrayDeque<>();
                Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(second::push);

                int total = 0;

                while (!first.isEmpty() && !second.isEmpty()) {

                    int sum = first.peek() + second.peek();

                    if (sum % 2 == 0) {
                        total += sum;
                        first.poll();
                        second.pop();
                    } else {
                        first.offer(second.pop());
                    }
                }
                if (first.isEmpty()) {
                    System.out.println("First magic box is empty.");
                } else if (second.isEmpty()) {
                    System.out.println("Second magic box is empty.");
                }

        if (total >= 90) {
            System.out.printf("Wow, your prey was epic! Value: %d%n", total);
        } else {
            System.out.printf("Poor prey... Value: %d", total);
        }
    }
}
