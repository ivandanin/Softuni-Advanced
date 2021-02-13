import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lilies = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        List<Integer> roses = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        int wreaths = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            if (roses.get(0) + lilies.get(lilies.size() - 1) == 15) {
                wreaths++;
                roses.remove(0);
                lilies.remove(lilies.size() - 1);
            } else if (roses.get(0) + lilies.get(lilies.size() - 1) > 15){
                int newNum = lilies.get(lilies.size() - 1) - 2;
                lilies.add(lilies.size() - 1, newNum);
                lilies.remove(lilies.size() - 1);
            } else if (roses.get(0) + lilies.get(lilies.size() - 1) < 15){
                lilies.remove(lilies.size() - 1);
                roses.remove(0);
            }
        }
        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", wreaths);
        }
    }
}
