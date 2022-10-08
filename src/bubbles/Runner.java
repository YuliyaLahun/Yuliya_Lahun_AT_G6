package bubbles;

//- [ ] в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
//- [ ] - открыть поочередно все бутылки и выпустить из них газ
public class Runner {
    public static void main(String[] args) {
        SparklingWater sparklingWater = new SparklingWater();

        Bottle bottleHalfLiter = new Bottle(0.5, sparklingWater);
        Bottle bottleLiter = new Bottle(1.0, sparklingWater);
        Bottle bottleLiterAndAHalf = new Bottle(1.5, sparklingWater);

        bottleHalfLiter.open(sparklingWater.pump(new Bubble[5000]));
        bottleLiter.open(sparklingWater.pump(new Bubble[10000]));
        bottleLiterAndAHalf.open(sparklingWater.pump(new Bubble[15000]));

    }
}
