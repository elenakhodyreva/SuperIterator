package iterators;

import java.util.*;

public class SuperIterator implements Iterator {

    Collection<Iterator> iters;
    ArrayList<Integer> list;
    ArrayList<Iterator> iteratorList;

    int i;

    public SuperIterator(Collection<Iterator> iters) {
        this.iters = iters;
        i=0;
        iteratorList= new ArrayList(iters);
        list= new ArrayList<Integer>();
    }

    public boolean hasNext() {

        return (i< (iters.size()-1));
    }

    public List<Integer> next() {

        while(hasNext()){

            for (int j=0; j<iteratorList.size(); j++){

                list.addAll((List<Integer>)iteratorList.get(j).next());
            }
            i++;
        }
        Collections.sort(list);
        return list;
    }

    public void remove() {

    }
}
