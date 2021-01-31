public class Car {
        String brand;
        String model;
        int horsePower;

        public Car(String brand) {
    this.brand = brand;
    this.model = "unknown";
    this.horsePower = -1;
}
        public Car(String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }
    }
