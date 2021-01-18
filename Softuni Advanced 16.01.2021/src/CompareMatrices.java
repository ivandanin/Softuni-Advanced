import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int row = input[0];
        int col = input[1];

        int[][] firstMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = arr;
        }

        input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int row2 = input[0];
        int col2 = input[1];

        int[][] secondMatrix = new int[row2][col2];

        for (int i = 0; i < row2; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = arr;
        }
        if (!areEqual(firstMatrix, secondMatrix)) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }
    }
    static boolean areEqual (int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        } else {
            for (int row = 0; row < firstMatrix.length; row++) {
                if (firstMatrix[row].length != secondMatrix[row].length) {
                    return false;
                } else {
                    for (int col = 0; col < firstMatrix[row].length; col++) {
                        if (firstMatrix[row][col] != secondMatrix[row][col]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
