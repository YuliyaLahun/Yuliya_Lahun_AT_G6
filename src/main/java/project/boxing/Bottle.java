package bubbles;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle {

    Water water;
    //Bubble[] bubbles;
    private double bottleVolume;

    public Bottle(double bottleVolume) {
        int quantityOfBubbles = (int) (10000 * bottleVolume);
        Bubble bubble = new Bubble("gaz");
        Bubble[] bubbles = new Bubble[quantityOfBubbles];
        ((SparklingWater) water).setBubbles(bubbles);
    }

    public Bottle(double bottleVolume, Water water) {
        this.bottleVolume = bottleVolume;
        this.water = water;
    }

    public void open() {
        ((SparklingWater) water).degas();
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
