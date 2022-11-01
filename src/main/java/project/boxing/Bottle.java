package project.boxing;

import project.factory.Transformable;
import project.liquids.SparklingWater;
import project.liquids.Water;
import project.substance.Bubble;

import java.util.ArrayList;
import java.util.List;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle extends Vessel implements Containable{

    List<Bubble> bubbles;
    private Water water;
    private double volume;


    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        this.water = new SparklingWater();
        int quantityOfBubbles = (int) (10000 * volume);
        this.bubbles = new ArrayList<>(quantityOfBubbles);
        for (int i = 0; i < quantityOfBubbles; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        ((SparklingWater) water).setBubbles(bubbles);
    }

    public Bottle(double volume) {
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

    public void open() {
        ((SparklingWater) water).setOpened(true);
        ((SparklingWater) water).isOpened();
    }

    @Override
    public void close() {

    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
