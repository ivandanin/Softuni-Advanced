package GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericCountMethodString<String> box = new GenericCountMethodString<String>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }

        String comparator = scanner.nextLine();

        System.out.println(box.counter(comparator));

    }
}
