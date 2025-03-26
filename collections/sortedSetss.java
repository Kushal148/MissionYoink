package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSetss {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();

        s.add(1);
        s.add(5);
        s.add(3);
        s.add(1);
        s.add(2);

        Iterator c = s.iterator();

        while (c.hasNext())
            System.out.println(c.next());
    }
}
