package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstIterator implements Iterator {

    ArrayList<Integer> iter1;

    public FirstIterator(ArrayList<Integer> iter1) {
        this.iter1 = iter1;
    }

    public boolean hasNext() {
        return false;
    }

    public List<Integer> next() {

        return iter1;
    }

    public void remove() {

    }
}
