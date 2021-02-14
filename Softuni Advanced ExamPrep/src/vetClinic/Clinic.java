package vetClinic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clinic {
    private List<Pet> petsList;
    private int capacity;

    public Clinic(int capacity) {
        this.petsList = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (capacity > 0) {
            capacity--;
            this.petsList.add(pet);
        }
    }

    public boolean remove(String name) {
       return this.petsList.removeIf(p -> p.getName().equals(name));
    }
    public Pet getPet(String name, String owner){
        return this.petsList
                .stream()
                .filter(p -> p.getOwner().equals(owner)
                        && p.getName().equals(name))
                .findAny().orElse(null);
    }
    public Pet getOldestPet() {
        return this.petsList.stream().max(Comparator.comparing(Pet::getAge)).get();
    }
    public int getCount() {
        return this.petsList.size();
    }
    public StringBuilder getStatistics() {
        StringBuilder output = new StringBuilder("The clinic has the following patients:");
        for (Pet pet : petsList) {
            output.append(System.lineSeparator());
            output.append(pet.getName())
                    .append(" ")
                    .append(pet.getOwner());
        }
        return output;
    }
}
