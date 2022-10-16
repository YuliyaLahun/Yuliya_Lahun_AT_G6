package project.liquids;

import project.substance.Bubble;

import static java.lang.System.out;

//-  создать класс SparklingWater, являющийся дочерним Water
//- [ ] - у газировки есть пузырьки
//- [ ] - вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- [ ] - 1 литр воды содержит 10 тыс пузырьков
//- [ ] - у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater() {
        this.isOpened();
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void pump() {
        out.println("Setting bubbles to the water");
        this.setBubbles(bubbles);
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void isOpened() {
        if (this.isOpened) {
            out.println("The bottle is opened, starting degas");
            this.degas();
        }
    }

    public boolean isSparkle() {
        boolean isSparkle = false;
        if (this.getBubbles().length > 0) {
            isSparkle = true;
        }
        out.printf("Checking if the water is sparkle: %s", isSparkle);
        return isSparkle;
    }

    //- [ ] ------ есть приватный метод degas(), который каждую секунду
    // выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    public void degas() {
        out.println("Degas is started...");
        for (int i = 0; i < bubbles.length - 1; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
    }

}
