import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> nNumbers = new LinkedHashSet<>();
        Set<String> mNumbers = new LinkedHashSet<>();

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = input[0];
        int m = input[1];


        for (int i = 0; i < n; i++) {
            String numbersOfN = scanner.nextLine();
            nNumbers.add(numbersOfN);
        }
        for (int i = 0; i < m; i++) {
            String numbersOfM = scanner.nextLine();
            mNumbers.add(numbersOfM);
        }

        nNumbers.forEach(e -> {
            if (mNumbers.contains(e)) {
                System.out.print(e + " ");
            }
        });
    }
}
