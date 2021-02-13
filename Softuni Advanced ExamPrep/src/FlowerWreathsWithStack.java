import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreathsWithStack {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayDeque<Integer> lilies = Arrays.stream(scanner.nextLine()
            .split(", "))
            .map(Integer::parseInt)
            .collect(Collectors.toCollection(ArrayDeque::new));

    ArrayDeque<Integer> roses = Arrays.stream(scanner.nextLine()
            .split(", "))
            .map(Integer::parseInt)
            .collect(Collectors.toCollection(ArrayDeque::new));


    int wreaths = 0;

    while (!lilies.isEmpty() && !roses.isEmpty()) {
        if (roses.peek() + lilies.peekLast() == 15) {
            wreaths++;
            roses.poll();
            lilies.pollLast();
        } else if (roses.peek() + lilies.peekLast() > 15){
            int newNum = lilies.peekLast() - 2;
            lilies.pollLast();
            lilies.offer(newNum);
        } else if (roses.peek() + lilies.peekLast() < 15){
            lilies.pollLast();
            roses.poll();
        }
    }
    if (wreaths >= 5) {
        System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
    } else {
        System.out.printf("You didn't make it, you need %d wreaths more!", wreaths);
    }
}
}
