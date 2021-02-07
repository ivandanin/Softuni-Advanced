package GenericSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericSwapMethodInteger<Integer> boxOfInteger = new GenericSwapMethodInteger<Integer>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            boxOfInteger.add(input);
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        boxOfInteger.swap(first, second);
        System.out.println(boxOfInteger);
    }
}
