import java.util.*;
import java.util.stream.Collectors;

public class SantaPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> materialsBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(materialsBox::push);

        ArrayDeque<Integer> magic = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        Map<Integer, String> toys = new LinkedHashMap<>();
        toys.put(150, "Doll");
        toys.put(250, "Wooden train");
        toys.put(300, "Teddy bear");
        toys.put(400, "Bicycle");

        Map<String, Integer> ready = new TreeMap<>();
        toys.values().forEach(t -> ready.put(t, 0));

        while (!materialsBox.isEmpty() && !magic.isEmpty()) {
            int first = materialsBox.pop();
            int second = magic.poll();

            int sum = first * second;
            if (isEquals(sum)) {
                ready.put(toys.get(sum), ready.get(toys.get(sum)) + 1);
            } else if (sum < 0) {
               materialsBox.push(first + second);
            } else if (sum > 0 && !isEquals(sum)) {
                materialsBox.push(first + 15);
            } else if (sum == 0) {
                 if (first == 0) {
                     magic.addFirst(second);
                 } else if (second == 0) {
                     materialsBox.push(first);
                 }
            }
        }
        if (ready.containsKey("Doll") && ready.containsKey("Train")
               && ready.get("Doll") > 0 && ready.get("Train") > 0
        || ready.containsKey("Teddy bear") && ready.containsKey("Bicycle")
               && ready.get("Teddy bear") > 0 && ready.get("Bicycle") > 0) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }
        if (!materialsBox.isEmpty()) {
                System.out.printf("Materials left: %s%n", materialsBox.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        } if (!magic.isEmpty()) {
            System.out.printf("Magic left: %s%n", magic.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        for (Map.Entry<String, Integer> entry : ready.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
    public static boolean isEquals(int sum){
        return sum == 150
                || sum == 250
                || sum == 300
                || sum == 400;
    }
}
