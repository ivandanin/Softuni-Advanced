package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
        private List<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
    }
    public void add(T input) {
        this.list.add(input);
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
