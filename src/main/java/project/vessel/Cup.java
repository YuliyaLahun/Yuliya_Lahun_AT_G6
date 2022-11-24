package project.vessel;


import project.material.MaterialTypes;
import project.stuff.Transformable;

public class Cup extends Vessel implements Containable{

    private Transformable stuff;

    public Cup(double volume, double diameter, int weight, MaterialTypes material) {
        super(volume, 8, weight, material);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void warm(int temperature) {

    }

}
