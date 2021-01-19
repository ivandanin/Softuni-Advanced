import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        printMatrix(fillMatrix(n, pattern));
    }
    static void fillPatternA (int[][] matrix) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = number++;

            }
        }
    }
    static void fillPatternB (int[][] matrix) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = number++;
                }
            } else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    matrix[col][row] = number++;
                }
            }
        }
    }
    static int[][] fillMatrix (int n, String pattern) {
        int[][] matrix = new int[n][n];
        if (pattern.equals("A")) {
            fillPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillPatternB(matrix);
        }
        return matrix;
    }
static void printMatrix (int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println();
    }
}
}
