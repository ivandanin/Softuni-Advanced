import java.util.*;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> gradesOfStudents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);

            gradesOfStudents.putIfAbsent(name, new ArrayList<>());
            gradesOfStudents.get(name).add(grade);

        }
        gradesOfStudents.forEach((key, value) -> {
            double average = 0;
            for (Double gradeOfStudent : value) {
                average += gradeOfStudent;
            }
            average /= value.size();
            System.out.printf("%s -> %s (avg: %.2f)%n", key, String.join(" ",value.toString()), average);

        });
    }
}
