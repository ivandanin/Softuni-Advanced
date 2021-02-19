package rabbits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    String name;
    int capacity;
    List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit) {
        if (this.data.size() < this.capacity) {
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name) {
       return this.data.removeIf(n -> n.getName().equals(name));
    }
    public boolean removeSpecies(String species) {
       return data.removeIf(r -> !r.getSpecies().equals(species));
    }
    public Rabbit sellRabbit(String name) {
        this.data.stream().filter(r -> r.getName().equals(name))
                .findFirst().ifPresent(a -> a.setAvailable(false));
        return this.data.stream().filter(a -> a.getSpecies().equals(name)).findFirst().orElse(null);
    }
    public List<Rabbit> sellRabbitBySpecies(String species) {
        this.data.stream().filter(s -> s.getSpecies().equals(species)).forEach(v -> v.setAvailable(false));
        return this.data.stream().filter(n -> n.getSpecies().equals(species)).collect(Collectors.toList());
    }
    public int count() {
        return this.data.size();
    }
    public StringBuilder report() {
        StringBuilder output = new StringBuilder("Rabbits available at ");
        output.append(name).append(":");
        for (Rabbit rabbit : data) {
            output.append(System.lineSeparator())
                    .append(rabbit);
        }
        return output;
    }

}
