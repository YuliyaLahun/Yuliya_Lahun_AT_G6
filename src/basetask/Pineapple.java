package basetask;


public class Pineapple {

    private String grade;

    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails(){
        if (Double.compare(heatCapacity, 2140)==1){
            System.out.printf("Я ананас, теплоемкость которого больше, чем у ветчины%n");
        } else {
            System.out.printf("В ветчине тепла запасется больше :(%n");
        }
    }
}
