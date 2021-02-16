import java.util.*;
import java.util.stream.Collectors;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> second = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(second::push);

        List<Integer> sums = new ArrayList<>();

        while (!second.isEmpty() && !first.isEmpty()) {
            int firstLine = first.poll();
            int secondLine = second.pop();

            int sum = firstLine + secondLine;
            if (sum % 2 == 0) {
                sums.add(sum);
            } else {
                first.offer(secondLine);
            }
        }
        if (first.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else if (second.isEmpty()) {
            System.out.println("Second lootbox is empty");
        }
            int total = 0;
        for (Integer sum : sums) {
            total += sum;
        }
        if (total >= 100) {
            System.out.printf("Your loot was epic! Value: %d%n", total);
        }
        else {
            System.out.printf("Your loot was poor... Value: %d", total);
        }
    }
}
