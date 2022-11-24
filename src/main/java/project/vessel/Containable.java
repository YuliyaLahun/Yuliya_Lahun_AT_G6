package project.vessel;

import project.stuff.Transformable;

public interface Containable {

    void addStuff (Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    int getFreeSpace();

    void open() throws InterruptedException;

    public void warm(int temperature);

}
