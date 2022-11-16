package project.vessel;

import project.material.MaterialTypes;
import project.material.Plastic;
import project.stuff.Transformable;
import project.stuff.SparklingWater;
import project.stuff.Water;
import project.stuff.Bubble;

import java.util.ArrayList;
import java.util.List;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle extends Vessel implements Containable{

    private Transformable stuff;


    List<Bubble> bubbles;
    private Water water;
    private double volume;


    public Bottle(double volume, double diameter, int weight, MaterialTypes material) throws InterruptedException {
        super(volume, 2, weight, material);
        this.water = new SparklingWater();
        int quantityOfBubbles = (int) (10000 * volume);
        this.bubbles = new ArrayList<>(quantityOfBubbles);
        for (int i = 0; i < quantityOfBubbles; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        ((SparklingWater) water).setBubbles(bubbles);
    }

    public Bottle(double volume) throws InterruptedException {
        this(1, 2, 100, new Plastic(0.5, "white", 0.3));
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

    public void setBubbles(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.water = water;
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

    public void open() throws InterruptedException {
        ((SparklingWater) water).setOpened(true);
        ((SparklingWater) water).isOpened();
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
