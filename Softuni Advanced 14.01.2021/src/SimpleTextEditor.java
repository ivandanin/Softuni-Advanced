import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(tokens[0]);

            switch (command) {
                case 1:
                    stack.push(text.toString());
                    text.append(tokens[1]);
                    break;
                case 2:
                    stack.push(text.toString());
                    text.replace(text.length() - Integer.parseInt(tokens[1]),text.length(),"");
                    break;
                case 3:
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case 4:
                    if (!stack.isEmpty()) {
                       text = new StringBuilder(stack.pop());
                    }
                    break;

            }
        }
    }
}
