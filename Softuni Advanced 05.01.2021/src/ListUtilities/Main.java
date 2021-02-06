package ListUtilities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 18, 2, -1);

        Integer maxInteger = ListUtils.getMax(integers);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "A", "B", "f");

        String minString = ListUtils.getMin(strings);

    }
}
