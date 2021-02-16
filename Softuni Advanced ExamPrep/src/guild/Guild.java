package guild;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    ArrayList<Player> data;
    String name;
    int capacity;

    public Guild(String name, int capacity) {
        this.data = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public ArrayList<Player> getData() {
        return data;
    }

    public void setData(List<Player> data) {
        this.data = (ArrayList<Player>) data;
    }

    public void addPlayer(Player player) {
        this.data.add(player);
    }

    public boolean removePlayer(String name) {
        return data.removeIf(n -> n.getName().equals(name));
    }

    public void promotePlayer(String name) {
         this.data.stream().filter(p -> p.getName().equals(name))
                .findFirst().ifPresent(p -> p.setRank("Member"));
    }

    public void demotePlayer(String name) {
        this.data.stream().filter(p -> p.getName().equals(name))
                .findFirst().ifPresent(p -> p.setRank("Trial"));
    }
    public Player[] kickPlayersByClass(String clazz) {
        Player[] result = this.data.stream().filter(p -> p.getClazz()
                .equals(clazz)).toArray(Player[]::new);
        setData(data.stream().filter(p -> !p.getClazz().equals(clazz)).collect(Collectors.toList()));
        return result;
    }
    public int count() {
        return this.data.size();
    }

    public StringBuilder report() {
        StringBuilder output = new StringBuilder("Players in the guild: ");
        output.append(name).append(":");
        for (Player d : data) {
            output.append(System.lineSeparator()).append(d);
        }
        return output;
    }
}
