import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Robotics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> robots = Arrays.stream(scanner.nextLine().split(";")).collect(Collectors.toList());

        String[] names = new String[robots.size()];
        int[] processTime = new int[robots.size()];

        for (int i = 0; i < robots.size(); i++) {
            String[] tokens = robots.get(i).split("-");
            String name = tokens[0];
            names[i] = name;

            int time = Integer.parseInt(tokens[1]);
            processTime[i] = time;
        }
        String startTime = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();
        String productFromInput;

        while (!"End".equals(productFromInput = scanner.nextLine())) {
            queue.offer(productFromInput);
        }
        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int mins = Integer.parseInt(timeData[1]);
        int secs = Integer.parseInt(timeData[2]);

        int startTimeInSecond = hours * 3600 + mins * 60 + secs;
        int[] robotsWorkLeft = new int[robots.size()];

        while (!queue.isEmpty()) {
            startTimeInSecond++;
            String product = queue.poll();
            int index = -1;

            for (int i = 0; i < robotsWorkLeft.length; i++) {
                if (robotsWorkLeft[i] > 0) {
                    robotsWorkLeft[i]--;
                }
                if (robotsWorkLeft[i] == 0 && index == -1) {
                    index = i;
                }
            }

            if (index != -1) {
                robotsWorkLeft[index] = processTime[index];
                System.out.println(printRobotData(names[index], product, startTimeInSecond));
            } else {
                queue.offer(product);
            }
        }
    }
    static Object printRobotData(String name, String product, int startTimeInSecond) {
        long seconds = startTimeInSecond % 60;
        long minutes = (startTimeInSecond / 60) % 60;
        long  hours = (startTimeInSecond / (60 * 60)) % 24;
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return String.format("%s - %s [%s]", name, product, time);
    }
}
