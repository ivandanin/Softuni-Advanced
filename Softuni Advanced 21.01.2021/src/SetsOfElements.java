import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> nNumbers = new LinkedHashSet<>();
        Set<String> mNumbers = new LinkedHashSet<>();

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 0; i < n; i++) {
            String numbersOfN = scanner.nextLine();
            nNumbers.add(numbersOfN);
        }
        for (int i = 0; i < m; i++) {
            String numbersOfM = scanner.nextLine();
            mNumbers.add(numbersOfM);
        }
        for (String mNumber : mNumbers) {
        if (nNumbers.contains(mNumber)) {
            System.out.print(mNumber + " ");
        } else {
            System.out.println(" ");
        }
        }
    }
}
