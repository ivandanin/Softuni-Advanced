import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> firstDeck = (HashSet<Integer>) Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());
        HashSet<Integer> secondDeck = (HashSet<Integer>) Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());

        int rounds = 50;

        for (int i = 0; i < rounds; i++) {

           int firstTop = firstDeck.iterator().next();
           firstDeck.remove(firstTop);

           int secondTop = secondDeck.iterator().next();
           secondDeck.remove(secondTop);

           if (firstTop > secondTop) {
               firstDeck.add(firstTop);
               firstDeck.add(secondTop);

           } else if (secondTop > firstTop) {
               firstDeck.add(firstTop);
               firstDeck.add(secondTop);
           }
           if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
            break;
        }
    }
        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (firstDeck.size() < secondDeck.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
        }
}
