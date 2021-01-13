import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> indexesOfOpeningBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '(') {
                indexesOfOpeningBrackets.push(i);
            } else if (symbol == ')') {
                System.out.println(input.substring(indexesOfOpeningBrackets.pop(), i + 1));
            }
        }
    }
}
