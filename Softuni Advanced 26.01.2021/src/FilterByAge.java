import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge {

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            list.add(person);
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        Predicate<Person> ageFilter = createAgeFilter(condition, age);

        String format = scanner.nextLine();
        Function<Person, String> formatter = createFormatter(format);

        System.out.println(list.stream().filter(ageFilter).map(formatter)
                .collect(Collectors.joining(System.lineSeparator())));

    }
    private static Function<Person, String> createFormatter(String format) {
        if (format.equals("name")) {
            return p -> p.name;
        } else if (format.equals("age")) {
            return  p -> String.valueOf(p.age);
        }
        return p -> p.name + " - " + p.age;
    }

    private static Predicate<Person> createAgeFilter(String condition, int age) {
        if (condition.equals("older")) {
            return p -> p.age >= age;
        }
        return p -> p.age <= age;
    }
}
