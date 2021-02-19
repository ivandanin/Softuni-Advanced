import java.util.Scanner;

public class Selling {
    private static int row;
    private static int col;
    private static int revenue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];
        for (int r = 0; r < matrix.length; r++) {
            String input = scanner.nextLine();
            matrix[r] = input.toCharArray();

            if (input.contains("S")) {
                row = r;
                col = input.indexOf("S");
            }
        }
        boolean isInTheMatrix = true;

        while (revenue < 50 && isInTheMatrix) {
          String command = scanner.nextLine();

          switch (command) {

              case "up":
                  isInTheMatrix = movePlayer(row - 1, col, matrix);
                  break;
              case "down":
                  isInTheMatrix = movePlayer(row + 1, col, matrix);
                  break;
              case "left":
                  isInTheMatrix = movePlayer(row, col - 1, matrix);
                  break;
              case "right":
                  isInTheMatrix = movePlayer(row, col + 1, matrix);
                  break;
          }
        }
        String output = isInTheMatrix ? "Good news! You succeeded in collecting enough money!"
                : "Bad news, you are out of the bakery.";
        System.out.println(output);
        System.out.println("Money: " + revenue);

        printMatrix(matrix);
    }


    private static boolean movePlayer(int nextRow, int nextCol, char[][] matrix) {

        matrix[row][col] = '-';

        if (isOutOfBounds(nextRow, nextCol, matrix)) {
            return false;
        }
        char symbol = matrix[nextRow][nextCol];

        if (Character.isDigit(symbol)) {
            revenue += symbol - '0';
        } else if (symbol == 'O') {
            matrix[nextRow][nextCol] = '-';
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[row][col] == 'O') {
                        nextRow = row;
                        nextCol = col;
                        break;
                    }
                }
                if (matrix[nextRow][nextCol] == 'O') {
                    break;
                }
            }
        }
        matrix[nextRow][nextCol] = 'S';
        row = nextRow;
        col = nextCol;

        return true;
    }
    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length
                || col < 0 || col >= matrix.length;
    }
    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (int c = 0; c < matrix[row].length; c++) {
                System.out.print(chars[c]);
            }
            System.out.println();
        }
    }
}
