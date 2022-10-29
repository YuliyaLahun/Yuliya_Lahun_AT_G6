package project.boxing;

import project.liquids.SparklingWater;
import project.liquids.Water;
import project.substance.Bubble;

import java.util.ArrayList;
import java.util.List;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle {

    List<Bubble> bubbles;
    private Water water;
    private double volume;

    public Bottle(double volume) {
        this.water = new SparklingWater();
        int quantityOfBubbles = (int) (10000 * volume);
        this.bubbles = new ArrayList<>(quantityOfBubbles);
        for (int i = 0; i < quantityOfBubbles; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        ((SparklingWater) water).setBubbles(bubbles);
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

    public void open() {
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
