package CarSalesman;

public class Car {
    String model;
    Engine engine;
    int weight;
    String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.model);
        sb.append(":")
                .append(System.lineSeparator())
                .append(this.engine)
                .append(System.lineSeparator());
        sb.append("Weight: ")
                .append(this.weight == 0 ? "n/a" : this.weight).
                append(System.lineSeparator());
        sb.append("Color: ")
                .append(this.color)
                .append(System.lineSeparator());
        return sb.toString().trim();
    }
}
