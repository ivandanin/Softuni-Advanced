import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> info = new LinkedHashMap<>();
        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] tokens = commands.split("\\s+");

                String output = "";
            switch (tokens[0]) {

                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (info.containsKey(id)) {
                    info.get(id).deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                    } else {
                        System.out.print("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterest(newInterest);
                    output = null;
                    break;

                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (info.containsKey(id)) {
                        double interest = info.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    } else {
                        System.out.print("Account does not exist");
                    }
                    break;
                default:
                    BankAccount bankAccount = new BankAccount();
                    info.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }

            commands = scanner.nextLine();
        }
    }
}
