import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }


        int rows = 0;
        int cols = 0;
        int sumOfFirstDiagonal = 0;

        while (rows < n && cols < n) {
            sumOfFirstDiagonal += matrix[rows++][cols++];
        }
        rows = n - 1;
        cols = 0;
        int sumOfSecondDiagonal = 0;

        while (rows >= 0 && cols < n) {
            sumOfSecondDiagonal += matrix[rows--][cols++];
        }

        int total = sumOfSecondDiagonal - sumOfFirstDiagonal;
        System.out.println(total);
    }
}
