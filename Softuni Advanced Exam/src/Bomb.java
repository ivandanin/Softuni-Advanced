
import java.util.Scanner;

public class Bomb {
    private static int row;
    private static int col;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        String[] commands = scanner.nextLine().split(",");
        char[][] field = readMatrix(scanner, size);
        int bombs = bombsLeft(field);

            for (String command : commands) {
                field[row][col] = '+';
                switch (command) {
                    case "up":
                        row--;
                        if (isOutOfBounds(field)) {
                            row++;
                        }
                        break;
                    case "down":
                        row++;
                        if (isOutOfBounds(field)) {
                            row--;
                        }
                        break;
                    case "left":
                        col--;
                        if (isOutOfBounds(field)) {
                            col++;
                        }
                        break;
                    case "right":
                        col++;
                        if (isOutOfBounds(field)) {
                            col--;
                        }
                        break;
                }
                if (field[row][col] == 'e') {
                    System.out.printf("END! %d bombs left on the field%n", bombs);
                    return;
                } else if (field[row][col] == 'B') {
                    System.out.println("You found a bomb!");
                    bombs--;
                }
                field[row][col] = 's';
                if (bombs == 0) {
                    break;
                }
            }

        if (bombs > 0) {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)%n", bombs, row, col);
        } else {
            System.out.println("Congratulations! You found all bombs!");
        }
    }

    private static boolean isOutOfBounds(char[][] field) {
        return row < 0 || row >= field.length
                || col < 0 || col >= field.length;
    }
    private static int bombsLeft(char[][] field) {
        int number = 0;
        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == 'B') {
                    number++;
                }
            }
        }
        return number;
    }
    private static char[][] readMatrix(Scanner scanner, int size) {

        char[][] field = new char[size][size];

        for (int r = 0; r < field.length; r++) {
            String input = scanner.nextLine()
                    .replaceAll("\\s+", "");

            field[r] = input.toCharArray();
            if (input.contains("s")) {
                row = r;
                col = input.indexOf("s");
            }
        }
        return field;
    }
}
