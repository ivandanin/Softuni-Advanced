import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(String.valueOf(scanner.nextInt()));
            stack.offer(number);
        }
        while (s > 0 && !stack.isEmpty()) {
            stack.poll();
            s--;
        }
        if (stack.isEmpty()){
            System.out.println("0");
        } else if (!stack.contains(x)) {
            System.out.println(getMin(stack));
        } else if (stack.contains(x)) {
            System.out.println(true);
        }
    }
    static int getMin (ArrayDeque<Integer> stack) {
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
