package SpeedRacing;

public class Car {
    String model;
    double fuelAmount;
    double fuelPerKm;
    int distance;

    public Car(String model, int fuelAmount, double fuelPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKm = fuelPerKm;

    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public int getDistance() {
        return distance;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void isDistancePossible(int kms) {
        boolean possible = getFuelAmount() >= getFuelPerKm() * kms;

        if (possible) {
            double fuelLeft = getFuelAmount() - getFuelPerKm() * kms;
            setDistance(getDistance() + kms);
            setFuelAmount(fuelLeft);
        } else {
            System.out.printf("Insufficient fuel for the drive%n");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.getModel(), this.getFuelAmount(), this.getDistance());
    }
}
