package bubbles;

//-  создать класс SparklingWater, являющийся дочерним Water
//- [ ] - у газировки есть пузырьки
//- [ ] - вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
//- [ ] - 1 литр воды содержит 10 тыс пузырьков
//- [ ] - у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье
public class SparklingWater extends Water {

    private Bubble[] bubbles;


    public Bubble[] pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("gaz");
        }
        return bubbles;
    }

    public void degas(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length - 1; i++) {
            bubbles[i].burst();

        }
    }

}
