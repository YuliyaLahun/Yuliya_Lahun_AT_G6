package classwork.day8;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetAndTreeSet {

    public static void main(String[] args) {

        Set<String> myHashSet = new HashSet<String>();
        Set<String> myTreeSet = new TreeSet<String>();

        for (int i = 0; i < 100000; i++) {
            myHashSet.add("ping"+i);
            myTreeSet.add("pong"+i);
        }
        Iterator iteratorForHashSet = myHashSet.iterator();
        long t0 = System.currentTimeMillis();
        while (iteratorForHashSet.hasNext()){
            iteratorForHashSet.next();
        }
        System.out.println(System.currentTimeMillis()-t0);
        Iterator iteratorForTreeSet = myTreeSet.iterator();
        long t1 = System.currentTimeMillis();
        while (iteratorForTreeSet.hasNext()){
            iteratorForTreeSet.next();
        }
        System.out.println(System.currentTimeMillis()-t1);


    }
}
