import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.offer(Integer.parseInt(number));
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(stack.pollLast() + " ");
        }
    }
}
