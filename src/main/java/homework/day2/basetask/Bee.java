package homework.day2.basetask;

public class Bee {

    private String gender;

    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        System.out.printf("Я легче лося в %d раз%n", 500 / weight);
    }
}
