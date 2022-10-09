package bubbles;

//- [ ] - у него есть обьем
//- [ ] - есть вода
//- [ ] - есть метод open(), который вызывает метод degas() в газировке
public class Bottle {

    Water water;
    Bubble[] bubbles;
    private final double bottleVolume;

    public Bottle(double bottleVolume, Water water) {
        this.bottleVolume = bottleVolume;
        this.water = water;
    }

    public void open(Bubble[] bubbles) {
        ((SparklingWater) water).degas(bubbles);
    }
}
