package CustomList;

import java.util.ArrayList;
import java.util.Collections;

public class CustomList<T extends Comparable<T>> {
    ArrayList<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }
    public void add(T element) {
        this.list.add(element);
    }
    public T remove(int index) {
       return this.list.remove(index);
    }
    public boolean contains(T element) {
        if (list.contains(element)) {
            return true;
        }
        return false;
    }
    public void swap(int first, int second) {
        T firstElement = this.list.get(first);
        T secondElement = this.list.get(second);

        this.list.add(first, secondElement);
        this.list.remove(first + 1);
        this.list.add(second, firstElement);
        this.list.remove(second + 1);
    }
    public int countGreaterThan(T element) {
        return (int) list
                .stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }
    public T getMax() {
        return Collections.max(this.list);
    }
    public T getMin() {
        return Collections.min(this.list);
    }

    public void print() {
    list.forEach(System.out::println);
    }
}
