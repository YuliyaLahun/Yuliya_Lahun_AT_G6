package classwork.day6;


public class GenericContainer <T> {

    private T[] objects;
    int freeSlot;

    public GenericContainer() {
        objects = (T[]) new Object[10];
        freeSlot = 0;
    }


    public void add(T o) {
        if (freeSlot < 10) {
            objects[freeSlot++] = o;
        } else {
            System.out.println("No free slots left");
        }
    }

    public T removeLast() {
        T object = null;
        if (freeSlot != 0) {
            object = objects[freeSlot - 1];
            objects[freeSlot-- - 1] = null;
        }
        return object;
    }

    public boolean isEmpty() {
        return freeSlot == 0;
    }

    public boolean isFull() {
        return freeSlot == objects.length;
    }
}
