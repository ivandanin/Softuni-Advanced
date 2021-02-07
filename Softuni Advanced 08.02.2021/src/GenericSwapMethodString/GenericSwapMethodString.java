package GenericSwapMethodString;

import java.util.ArrayList;
import java.util.List;

public class GenericSwapMethodString<T> {
    private List<T> list;

    public GenericSwapMethodString() {
        this.list = new ArrayList<>();
    }
    public void add(T input) {
        this.list.add(input);
    }
    public void swap(int first, int second) {
        T firstElement = this.list.get(first);
        T secondElement = this.list.get(second);

        this.list.add(first, secondElement);
        this.list.remove(first + 1);
        this.list.add(second, firstElement);
        this.list.remove(second + 1);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s: %s", t.getClass().getName(), t));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
