import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String swap = tokens[0];
            if (swap.equals("swap")) {
                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);

                if (row1 <= matrix.length && col1 <= matrix[row1].length &&
                row2 <= matrix.length && col2 <= matrix[row2].length) {
                    String change = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = change;

                    printArray(matrix);

                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
    static void printArray (String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
