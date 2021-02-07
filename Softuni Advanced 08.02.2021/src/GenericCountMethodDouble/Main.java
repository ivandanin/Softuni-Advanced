package GenericCountMethodDouble;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GenericCountMethodDouble<Double> box = new GenericCountMethodDouble<Double>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            box.add(input);
        }

        double comparator = Double.parseDouble(scanner.nextLine());
        System.out.println(box.counter(comparator));
    }
}
