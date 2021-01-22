import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Set<String>> playersDecks = new LinkedHashMap<>();

        while (!command.equals("JOKER")) {
            String[] tokens = command.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");


            if (!playersDecks.containsKey(name)) {
                playersDecks.put(name, new HashSet<>());
            }
            for (String card : cards) {
                playersDecks.get(name).add(card);
            }

            command = scanner.nextLine();
        }

        String regex = "([(0-9)]+|[(JQKA)])([SHDC]{1})";
        Pattern pattern = Pattern.compile(regex);

        for (Map.Entry<String, Set<String>> entry : playersDecks.entrySet()) {
            String name = entry.getKey();
            int playerScore = 0;
            for (String card : entry.getValue()) {
                Matcher matcher = pattern.matcher(card);

                if (matcher.find()) {
                    String power = matcher.group(1);
                    String type = matcher.group(2);

                    int value = getValueByPower(power);
                    int multiplier = getMultiplierByType(type);
                    int scores = value * multiplier;
                    playerScore += scores;


                }
            }
                    System.out.printf("%s: %s%n", name, playerScore);
        }
    }

    private static int getMultiplierByType(String type) {
        int multiplier = 0;
        switch (type) {
            case "S":
                multiplier = 4;
                break;
            case "H":
                multiplier = 3;
                break;
            case "D":
                multiplier = 2;
                break;
            case "C":
                multiplier = 1;
                break;
        }
        return multiplier;
    }

    private static int getValueByPower (String power) {
        int value;
        switch (power) {
            case "J":
value = 11;
                break;
            case "Q":
value = 12;
                break;
            case "K":
value = 13;
                break;
            case "A":
value = 14;
                break;
            default:
                value = Integer.parseInt(power);
                break;
        }
        return value;
    }
}
