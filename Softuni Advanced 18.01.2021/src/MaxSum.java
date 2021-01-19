import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner);

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scanner);

        }
        
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1] + " " + matrix[maxRow][maxCol + 2]);
        System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1] + " " + matrix[maxRow + 1][maxCol + 2]);
        System.out.println(matrix[maxRow + 2][maxCol] + " " + matrix[maxRow + 2][maxCol + 1] + " " + matrix[maxRow + 2][maxCol + 2]);
    }
    static int[] readArray (Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
