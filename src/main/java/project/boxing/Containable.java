package project.boxing;

import project.factory.Transformable;

public interface Containable {

    void addStuff (Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    int getFreeSpace();

    void open();

    void close();
}
