package RawData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            Tyres[] tyres = new Tyres[4];
            int count = 0;
            for (int j = 5; j < tokens.length; j += 2) {

            double tyrePressure = Double.parseDouble(tokens[j]);
            int tyreAge = Integer.parseInt(tokens[j + 1]);
            tyres[count++] = new Tyres(tyrePressure, tyreAge);
            }
            Car car = new Car(model, engine, cargo, tyres);
            cars.putIfAbsent(model, car);

        }
        String cargoType = scanner.nextLine();
        for (Car car : cars.values()) {

        if (cargoType.equals("flamable")
                && "flamable".equals(car.getCargo().getCargoType())
                && car.getEngine().getEnginePower() > 250) {
            System.out.println(car);

        } else if (cargoType.equals("fragile")
        && car.getCargo().getCargoType().equals("fragile")
        && car.hasTyreWithLessPressureThanOne()) {
            System.out.println(car);
        }
        }
    }
}
