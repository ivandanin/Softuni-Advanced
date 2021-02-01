package OpinionPoll;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                people.put(person.getName(), person.getAge());
            }
        }

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
