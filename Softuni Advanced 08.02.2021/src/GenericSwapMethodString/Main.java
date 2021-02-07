package GenericSwapMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericSwapMethodString<String> box = new GenericSwapMethodString<String>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        box.swap(first, second);

        System.out.println(box);
    }
}
