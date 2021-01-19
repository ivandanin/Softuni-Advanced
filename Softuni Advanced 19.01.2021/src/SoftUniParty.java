import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String command = scanner.nextLine();

        while (!command.equals("PARTY")) {
            if (Character.isDigit(command.charAt(0))) {
                vip.add(command);
            } else {
                regular.add(command);
            }

            command = scanner.nextLine();
        }
            while (!command.equals("END")) {
                if (vip.contains(command)) {
                    vip.remove(command);

                } else {
                    regular.remove(command);
                }

                command = scanner.nextLine();
            }
        System.out.println(vip.size() + regular.size());
        vip.addAll(regular);
        for (String didNotArrive : vip) {
            System.out.println(didNotArrive);
        }
    }
}
