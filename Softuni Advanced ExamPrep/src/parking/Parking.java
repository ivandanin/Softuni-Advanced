package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    List<Car> data;
    String type;
    int capacity;

    public Parking(String type, int capacity) {
        this.data = new ArrayList<>();
        this.type = type;
        this.capacity = capacity;
    }
    public void add(Car car) {
        data.add(car);
    }
    public boolean remove(String manufacturer, String model) {

        return data.removeIf(car -> car.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car car = null;
        for (Car d : data) {
            if (car == null || car.getYear() < d.getYear()){
                car = d;
            }
        }
        return car;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car d : data) {
            if (d.getManufacturer().equals(manufacturer) && d.getModel().equals(model)) {
                return d;
            }
        }
        return null;
    }
    public int getCount(){
        return data.size();
    }

    public StringBuilder getStatistics() {
        StringBuilder output = new StringBuilder("The cars are parked in ");
        output.append(type).append(":");
        for (Car d : data) {
            output.append(System.lineSeparator());
            output.append(d);
        }
        return output;
    }
}
