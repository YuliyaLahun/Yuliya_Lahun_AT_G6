package project.stuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

//-  создать класс SparklingWater, являющийся дочерним Water
//- [ ] - у газировки есть пузырьки
//- [ ] - вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- [ ] - 1 литр воды содержит 10 тыс пузырьков
//- [ ] - у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
public class SparklingWater extends Water {

    private List<Bubble> bubbles = new ArrayList<>();
    private boolean isOpened;

    public SparklingWater(double volume) throws InterruptedException {
        for (int i = 1; i <= (int)10000 * volume; i++) {
            this.bubbles.add(new Bubble("CO"));
        }
        this.isOpened();
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

    public void setBubbles(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void isOpened() throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (!this.bubbles.isEmpty()){
                try {
                    Thread.sleep(2000);
                    if (this.isOpened) {
                        out.println("The bottle is opened, starting degas");
                        this.degas();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }

    public boolean isSparkle() {
        boolean isSparkle = false;
        if (this.getBubbles().size() > 0) {
            isSparkle = true;
        }
        out.printf("Checking if the water is sparkle: %s", isSparkle);
        return isSparkle;
    }

    // ------ есть приватный метод degas(), который каждую секунду
    // выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
    public void degas() {
        out.println("Degas is started...");
        for (int i = 0; i < bubbles.size(); i++) {
            bubbles.get(i).cramp();
            bubbles.remove(i);
        }
    }

    @Override
    public void setTemperature(int temperature) {

    }

    @Override
    public void setOpened() {
        this.isOpened = true;
    }
}
