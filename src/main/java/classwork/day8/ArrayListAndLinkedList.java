package classwork.day8;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        for (int i = 0; i <100000 ; i++) {
            arrayList.add("string"+i);
        }
        for (int i = 0; i < 100000; i++) {
            linkedList.add("string"+i);
        }
        //count time for arrayList
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size() ; i++) {
            arrayList.get(i);
        }
        long t1 =  System.currentTimeMillis();
        long time = t1-t0;
        System.out.println("Time for arrayList= "+time);

        //count time for linkedList
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size() ; i++) {
            linkedList.get(i);
        }
        long t3 =  System.currentTimeMillis();
        long time1 = t3-t2;
        System.out.println("Time for linkedList= "+time1);
    }
}
