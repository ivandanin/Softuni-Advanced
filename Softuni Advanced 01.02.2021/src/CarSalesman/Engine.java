package CarSalesman;

public class Engine {
    String model;
    int power;
    int displacement;
    String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = Integer.parseInt("n/a");
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = efficiency;

    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.model);
        sb.append(":")
                .append(System.lineSeparator());
        sb.append("Power: ")
                .append(this.power)
                .append(System.lineSeparator());
        sb.append("Displacement: ")
                .append(this.displacement == 0 ? "n/a" : this.displacement)
                .append(System.lineSeparator());
        sb.append("Efficiency: ")
                .append(this.efficiency)
                .append(System.lineSeparator());
        return sb.toString().trim();
    }
    }
