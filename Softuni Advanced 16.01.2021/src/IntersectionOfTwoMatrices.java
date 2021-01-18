import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[row][col];
        char[][] secondMatrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            firstMatrix[i] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }

        for (int i = 0; i < row; i++) {
            secondMatrix[i] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }

        char[][] finalMatrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char firstSymbol = firstMatrix[i][j];
                char secondSymbol = secondMatrix[i][j];
                finalMatrix[i][j] = firstSymbol == secondSymbol ? firstSymbol : '*';
            }
        }
        printArray(finalMatrix);
    }

    static void printArray(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}