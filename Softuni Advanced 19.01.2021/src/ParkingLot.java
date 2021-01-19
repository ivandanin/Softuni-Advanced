import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> plates = new LinkedHashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("END")) {
        String[] input = command.split(", ");
        String direction = input[0];
        String plateNumber = input[1];

        if (direction.equals("IN")) {
          plates.add(plateNumber);
        } else if (direction.equals("OUT")) {
            plates.remove(plateNumber);
        }


            command = scanner.nextLine();
        }

        if (plates.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String plate : plates) {
                System.out.println(plate);
            }
        }


    }
}
