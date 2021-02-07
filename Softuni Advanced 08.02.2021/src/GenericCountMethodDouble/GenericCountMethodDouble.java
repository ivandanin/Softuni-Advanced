package GenericCountMethodDouble;

import java.util.ArrayList;

public class GenericCountMethodDouble<T extends Comparable<T>> {
    ArrayList<T> list;

    public GenericCountMethodDouble() {
        this.list = new ArrayList<>();
    }
    public void add(T input) {
        this.list.add(input);
    }
    public int counter(T element) {
        return (int) this.list
                .stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
}
}
