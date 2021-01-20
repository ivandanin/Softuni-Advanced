import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<Double>> graduationList = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");

            for (String grade : grades) {
            graduationList.putIfAbsent(name, new ArrayList<>());
            graduationList.get(name).add(Double.valueOf(grade));
            }
        }
        graduationList.forEach((key, value) -> {
            double average = 0;
            for (Double aDouble : value) {
                average += aDouble;
            }
            average /= value.size();

            System.out.printf("%s is graduated with %s%n", key, average);
        });
    }
}
