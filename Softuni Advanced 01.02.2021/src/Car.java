package RawData;

public class Car {
    String model;
    Engine engine;
    Cargo cargo;
    Tyres[] tyres;

    public Car(String model, Engine engine, Cargo cargo, Tyres[] tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public  boolean hasTyreWithLessPressureThanOne() {
        for (Tyres tyre : tyres) {
            if (tyre.getPressure() < 1) {
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
