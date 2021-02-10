package ListyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListyIterator {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;

        if (data.size() != 0) {
            this.index = 0;
        } else {
            this.index = -1;
        }
    }

    public boolean hasNext() {
        return this.index < data.size() - 1;
    }

    public boolean move() {
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public String print() {
        if (this.index == -1) {
            return "Invalid Operation!";
        } else {
            return this.data.get(this.index);
        }
    }
}
