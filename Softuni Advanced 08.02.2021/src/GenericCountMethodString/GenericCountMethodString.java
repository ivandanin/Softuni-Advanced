package GenericCountMethodString;

import java.util.ArrayList;

public class GenericCountMethodString<T extends Comparable<T>> {
    ArrayList<T> list;
    T element;

    public GenericCountMethodString() {
        this.list = new ArrayList<>();
        this.element = element;
    }

    public void add(T input) {
        this.list.add(input);
    }
    public int counter(T element) {
        return (int) this.list
                .stream()
                .filter(e -> e.compareTo(element) > 0).count();
    }
}
