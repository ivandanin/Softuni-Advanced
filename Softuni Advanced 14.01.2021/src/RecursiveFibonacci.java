import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long a = 0;
        long b = 1;
        long sum = 0;


        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;

        }
        System.out.println(sum);
    }
}
