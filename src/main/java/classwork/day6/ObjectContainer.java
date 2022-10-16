package classwork.day6;


public class ObjectContainer {

    Object[] objects = new Object[10];
    int freeSlot = 0;

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public void add(Object incoming) {
        if (freeSlot < 10) {
            objects[freeSlot++] = incoming;
        } else {
            System.out.println("No free slots left");
        }
    }

    public Object removeLast() {
        Object object = null;
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
