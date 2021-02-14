import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
                Arrays.stream(scanner.nextLine().split("\\s"))
                        .map(Integer::parseInt).forEach(ingredients::push);

        Map<Integer, String> toCook = new LinkedHashMap<>();
        toCook.put(25, "Bread");
        toCook.put(50, "Cake");
        toCook.put(75, "Pastry");
        toCook.put(100, "Fruit Pie");

        Map<String, Integer> cooked = new TreeMap<>();

        toCook.values().forEach(p -> cooked.put(p, 0));

                while (!liquids.isEmpty() && !ingredients.isEmpty()) {
                    int currLiquid = liquids.poll();
                    int currIngredient = ingredients.pop();

                    int sum = currLiquid + currIngredient;
                    if (!ableToCook(sum)) {
                    ingredients.push(currIngredient + 3);
                    } else {
                        String product = toCook.get(sum);
                        cooked.put(product, cooked.get(product) + 1);
                    }
                }
                if (hasCookedEachMeal(cooked)) {
                    System.out.println("Wohoo! You succeeded in cooking all the food!");
                } else {
                    System.out.println("Ugh, what a pity! " +
                            "You didn't have enough materials to to cook everything.");
                }
        System.out.println("Liquids left: " + getElementsLeft(liquids));
        System.out.println("Ingredients left: " + getElementsLeft(ingredients));

        for (Map.Entry<String, Integer> entry : cooked.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }

    private static String getElementsLeft(ArrayDeque<Integer> deque) {
        return deque.isEmpty()
                ? "none"
                : deque.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    private static boolean ableToCook(int sum) {
        return sum == 25 || sum == 50 || sum == 75 || sum == 100;
    }
    private static boolean hasCookedEachMeal(Map<String, Integer> cooked) {
        return cooked.values().stream().noneMatch(c -> c == 0);
    }
}
