package CustomListSorter;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    CustomListSorter<String> box = new CustomListSorter<String>();

    String commands = scanner.nextLine();
    while (!commands.equals("END")) {
        String[] tokens = commands.split("\\s+");

        switch (tokens[0]) {
            case "Add":
                box.add(tokens[1]);
                break;
            case "Remove":
                box.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(box.contains(tokens[1]));
                break;
            case "Swap":
                int first = Integer.parseInt(tokens[1]);
                int second = Integer.parseInt(tokens[2]);
                box.swap(first, second);
                break;
            case "Greater":
                System.out.println(box.countGreaterThan(tokens[1]));
                break;
            case "Min":
                System.out.println(box.getMin());
                break;
            case "Max":
                System.out.println(box.getMax());
                break;
            case "Print":
                box.print();
                break;
            case "Sort":
                Sorter.sort(box);
        }

        commands = scanner.nextLine();
    }
}
}
