import java.util.*;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int divisor = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number % divisor != 0) {
                list.add(number);
            }
        }
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        }
    }
