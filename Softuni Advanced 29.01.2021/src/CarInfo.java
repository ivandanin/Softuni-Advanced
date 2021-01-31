import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car;
            if (tokens.length == 1) {
                car = new Car(tokens[0]);
            } else {
                car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            }
            list.add(car);
        }
        for (Car car : list) {
            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsePower());
        }
    }
}
