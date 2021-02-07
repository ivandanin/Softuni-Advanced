package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericBoxOfInteger<Integer> box = new GenericBoxOfInteger<Integer>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
        Integer integer = Integer.parseInt(scanner.nextLine());
            box.add(integer);
        }
        System.out.println(box);
    }
}
