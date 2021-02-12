
import java.util.*;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bombEffects = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        List<Integer> bombCasing = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        int daturaBomb = 40;
        int daturaCount = 0;
        int cherryBomb = 60;
        int cherryCount = 0;
        int smokeDecoyBomb = 120;
        int decoyCount = 0;

        while (!bombCasing.isEmpty() || !bombEffects.isEmpty()) {

                if (bombEffects.get(0) + bombCasing.get(bombCasing.size() - 1) == daturaBomb) {
                    daturaCount++;
                    bombEffects.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                } else if (bombEffects.get(0) + bombCasing.get(bombCasing.size() - 1) == cherryBomb) {
                    cherryCount++;
                    bombEffects.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                } else if (bombEffects.get(0) + bombCasing.get(bombCasing.size() - 1) == smokeDecoyBomb) {
                    decoyCount++;
                    bombEffects.remove(0);
                    bombCasing.remove(bombCasing.size() - 1);
                } else {
                    int num = bombCasing.get(bombCasing.size() - 1) - 5;
                    bombCasing.add(bombCasing.size() - 1, num);
                    bombCasing.remove(bombCasing.size() - 1);
            }
        }
        if (daturaCount >= 3 && cherryCount == 3 && decoyCount == 3) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if (bombEffects.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            System.out.print("Bomb Effects: ");
            for (Integer bombEffect : bombEffects) {
                System.out.print(String.join(", ", String.valueOf(bombEffect)));
                System.out.println();
            }
        }
        if (bombCasing.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            System.out.print("Bomb Casings: ");
            for (Integer bombCasin : bombCasing) {
                System.out.print(String.join(", ", String.valueOf(bombCasin)));
                System.out.println();
            }
        }
        System.out.printf("Cherry Bombs: %d%n", cherryCount);
        System.out.printf("Datura Bombs: %d%n", daturaCount);
        System.out.printf("Smoke Decoy Bombs: %d%n", decoyCount);
    }
}
