import java.util.Scanner;

public class Bee {

    public static int beeRow = 0;
    public static int beeCol = 0;
    public static int flowers = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int r = 0; r < n; r++) {
            String input = scanner.nextLine();

            if (input.contains("B")) {
                beeRow = r;
                beeCol = input.indexOf("B");
            }
            matrix[r] = input.toCharArray();
        }
        String command = scanner.nextLine();
        boolean isLost = false;

        label:
        while (!command.equals("End")) {

            switch (command) {
                case "up":
                if (isOutOfBounds(beeRow - 1, beeCol, matrix)) {
                    isLost = true;
                    break label;
                } else {
                    moveBee(beeRow, beeCol, beeRow - 1, beeCol, matrix, "up");
                    beeRow--;
                }
                break;
                case "down":
                if (isOutOfBounds(beeRow + 1, beeCol, matrix)) {
                    isLost = true;
                    break label;
                } else {
                    moveBee(beeRow, beeCol, beeRow + 1, beeCol, matrix, "down");
                    beeRow++;
                }
                break;
                case "left":
                if (isOutOfBounds(beeRow, beeCol - 1, matrix)) {
                 isLost = true;
                    break label;
                } else {
                    moveBee(beeRow, beeCol, beeRow, beeCol - 1, matrix, "left");
                    beeCol--;
                }
                break;
                case "right":
                if (isOutOfBounds(beeRow, beeCol + 1, matrix)) {
                 isLost = true;
                    break label;
                } else {
                    moveBee(beeRow, beeCol, beeRow, beeCol + 1, matrix, "right");
                    beeCol++;
                }
                break;
            }

            command = scanner.nextLine();
        }
        if (isLost) {
            System.out.println("The bee got lost!");
            matrix[beeRow][beeCol] = '.';
        }
        if (flowers >= 5) {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowers);
        }
        printMatrix(matrix);
    }

    private static void moveBee(int currentRow, int currentCol, int newRow, int newCol, char[][] matrix, String move) {

        if (matrix[newRow][newCol] == 'f'){
            matrix[newRow][newCol] = 'B';
            flowers++;

        } else if (matrix[newRow][newCol] == '.') {
            matrix[newRow][newCol] = 'B';

        } else if (matrix[newRow][newCol] == 'O') {
            matrix[newRow][newCol] = 'B';
            beeRow = newRow;
            beeCol = newCol;
            matrix[newRow][newCol] = '.';

            switch (move) {
                case "up":
                    moveBee(beeRow, beeCol, beeRow - 1, beeCol, matrix, move);
                    break;
                case "down":
                    moveBee(beeRow, beeCol, beeRow + 1, beeCol, matrix, move);
                    break;
                case "left":
                    moveBee(beeRow, beeCol, beeRow, beeCol - 1, matrix, move);
                    break;
                case "right":
                    moveBee(beeRow, beeCol, beeRow, beeCol + 1, matrix, move);
                    break;
            }
        }
        matrix[currentRow][currentCol] = '.';
    }


    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length
                 || col < 0 || col >= matrix[row].length;
    }
    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
