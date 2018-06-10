package app;

import iterators.FirstIterator;
import iterators.SecondIterator;
import iterators.SuperIterator;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(1);
        list1.add(25);
        list1.add(38);

        ArrayList<Integer> list2= new ArrayList<Integer>();
        list2.add(15);
        list2.add(17);
        list2.add(19);


        Iterator iter1= new FirstIterator(list1);
        Iterator iter2= new SecondIterator(list2);

        Collection<Iterator> iters= new ArrayList<Iterator>();
        iters.add(iter1);
        iters.add(iter2);

        SuperIterator superIterator= new SuperIterator(iters);

        List<Integer> resultList;
        resultList= superIterator.next();

        for (Integer i : resultList)
            System.out.println(""+ i);
    }
}
