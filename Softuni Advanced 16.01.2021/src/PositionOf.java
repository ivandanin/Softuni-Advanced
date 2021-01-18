import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = readArray(scanner);

        int row = input[0];
        int col = input[1];

        int[][] matrix = new int[row][col];

        for (int r = 0; r < row; r++) {
            matrix[r] = readArray(scanner);
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());

        List<int[]> positions = new ArrayList<>();

        for (int rpw = 0; rpw < matrix.length; rpw++) {
            for (int cola = 0; cola < matrix[rpw].length; cola++) {
                if (matrix[rpw][cola] == searchedNumber) {
                    int[] indexes = new int[]{rpw, cola};
                    positions.add(indexes);
                }
            }
        }
        if (positions.isEmpty()) {
             System.out.println("not found");
        } else {
            for (int[] position : positions) {
                System.out.println(position[0] + " " + position[1]);
            }
        }

    }
    static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
    static void printArray(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
