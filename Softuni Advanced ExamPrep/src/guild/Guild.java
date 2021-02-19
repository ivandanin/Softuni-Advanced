package guild;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    private String name;
    private int capacity;
    private ArrayList<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public ArrayList<Player> getRoster() {
        return roster;
    }

    public void setData(List<Player> roster) {
        this.roster = (ArrayList<Player>) roster;
    }

    public void addPlayer(Player player) {
        this.roster.add(player);
    }

    public boolean removePlayer(String name) {
        return roster.removeIf(n -> n.getName().equals(name));
    }

    public void promotePlayer(String name) {
         this.roster.stream().filter(p -> p.getName().equals(name))
                .findFirst().ifPresent(p -> p.setRank("Member"));
    }

    public void demotePlayer(String name) {
        this.roster.stream().filter(p -> p.getName().equals(name))
                .findFirst().ifPresent(p -> p.setRank("Trial"));
    }
    public Player[] kickPlayersByClass(String clazz) {
        Player[] result = this.roster.stream().filter(p -> p.getClazz()
                .equals(clazz)).toArray(Player[]::new);
        setData(roster.stream().filter(p -> !p.getClazz().equals(clazz)).collect(Collectors.toList()));
        return result;
    }
    public int count() {
        return this.roster.size();
    }

    public StringBuilder report() {
        StringBuilder output = new StringBuilder("Players in the guild: ");
        output.append(name).append(":");
        for (Player d : roster) {
            output.append(System.lineSeparator()).append(d);
        }
        return output;
    }
}
