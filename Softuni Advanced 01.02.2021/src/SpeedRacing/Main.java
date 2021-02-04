package SpeedRacing;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Car> cars = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int fuelAmount = Integer.parseInt(tokens[1]);
            double fuelPerKm = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuelAmount, fuelPerKm);
            cars.add(car);
        }
        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] toDrive = commands.split("\\s+");
            String carModel = toDrive[1];
            int kms = Integer.parseInt(toDrive[2]);
            for (Car car : cars) {
                if (car.getModel().equals(carModel)) {
                    car.isDistancePossible(kms);
                }
            }
            commands = scanner.nextLine();
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
