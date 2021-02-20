package dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    List<Car> data;
    String name;
    int capacity;

    public Dealership(String name, int capacity) {
        this.data = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }
    public void add (Car car) {
        if (data.size() < capacity) {
            data.add(car);
        }
    }
    public boolean buy(String manufacturer, String model) {
        return this.data.removeIf(car -> car.getManufacturer().equals(manufacturer)
                && car.getModel().equals(model));
    }
    public Car getLatestCar() {
        return this.data.stream().min((a, b) -> Integer.compare(b.getYear(), a.getYear())).orElse(null);
    }
    public Car getCar(String manufacturer, String model) {
        return this.data.stream().filter(c -> c.getManufacturer().equals(manufacturer)
        && c.getModel().equals(model)).findFirst().orElse(null);
    }
    public int getCount() {
        return this.data.size();
    }
    public String getStatistics() {
        StringBuilder output = new StringBuilder("The cars are in a car dealership ");
        output.append(name)
                .append(":");
        for (Car info : data) {
            output.append(System.lineSeparator())
                    .append(info);
        }
        return output.toString();
    }
}
