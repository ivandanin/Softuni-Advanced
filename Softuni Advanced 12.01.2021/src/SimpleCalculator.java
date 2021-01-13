import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int rightValue = Integer.parseInt(tokens[++i]);
                int leftValue = stack.peek();
                stack.push(rightValue);

                int result = token.equals("+")
                        ? leftValue + rightValue
                        : leftValue - rightValue;

                stack.push(result);
            }
        }
        System.out.println(stack.peek());

        }

    }
