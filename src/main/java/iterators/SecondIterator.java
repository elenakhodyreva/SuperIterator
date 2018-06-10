package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecondIterator implements Iterator {

    ArrayList<Integer> iter2;

    public SecondIterator(ArrayList<Integer> iter2) {
        this.iter2 = iter2;
    }

    public boolean hasNext() {
        return false;
    }

    public List<Integer> next() {

        return iter2;
    }

    public void remove() {

    }
}
