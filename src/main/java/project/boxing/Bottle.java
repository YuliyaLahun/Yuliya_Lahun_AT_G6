package project.boxing;

import project.liquids.SparklingWater;
import project.liquids.Water;
import project.substance.Bubble;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle {

    Bubble[] bubbles;
    private Water water;
    private double volume;

    public Bottle(double volume) {
        this.water = new SparklingWater();
        int quantityOfBubbles = (int) (10000 * volume);
        Bubble[] bubbles = new Bubble[quantityOfBubbles];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        ((SparklingWater) water).setBubbles(bubbles);
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
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
