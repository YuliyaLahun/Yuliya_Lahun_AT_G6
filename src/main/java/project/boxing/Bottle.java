package project.boxing;

import project.substance.Bubble;
import project.liquids.SparklingWater;
import project.liquids.Water;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle {

    private Water water;
    private double volume;
    private SparklingWater sparklingWater;
    // есть ли другой способ обращаться к спарклинг вотер?

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    Bubble[] bubbles;

    public Bottle(double volume) {
        this.sparklingWater = new SparklingWater();
        int quantityOfBubbles = (int) (10000 * volume);
        Bubble[] bubbles = new Bubble[quantityOfBubbles];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        sparklingWater.setBubbles(bubbles);
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
    }

    public void open() {
        sparklingWater.setOpened(true);
        sparklingWater.isOpened();
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
