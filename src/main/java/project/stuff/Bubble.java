package project.stuff;

//- у пузырька должен быть обьем, газовый состав
//        - он должен уметь лопаться с выводом в консоль «Cramp!»
//        - обьем пузырька постоянный и равен 0.3 мм2, а газовый состав переменный в зависимости от образующего газа и задается в конструкторе класса
public class Bubble {

    private static final double VOLUME = 0.3;
    private String gazComposition;

    public Bubble(String gazComposition) {
        this.gazComposition = gazComposition;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public String getGazComposition() {
        return gazComposition;
    }

    public void setGazComposition(String gazComposition) {
        this.gazComposition = gazComposition;
    }
}
