import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String command = scanner.nextLine();
        String current = null;

        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (urls.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    current = urls.pop();
                }
            } else if (command.equals("forward")) {
                    if (forward.isEmpty()) {
                        System.out.println("no next URLs");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        current = forward.peek();
                        forward.clear();
                    }
            } else {
                if (current != null) {
                    urls.push(current);
                    forward.addFirst(command);
                }

                current = command;
            }
            System.out.println(current);
            command = scanner.nextLine();
        }
    }
}