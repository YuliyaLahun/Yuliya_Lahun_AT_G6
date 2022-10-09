package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processBee(new Bee("male", 20));
        trainMethodsObjects.processMouse(new Mouse("Mini", 3));
        trainMethodsObjects.processObstacle(new Obstacle("description", "critical"));
        trainMethodsObjects.processPineapple(new Pineapple("grade", 2140.1));
        trainMethodsObjects.processSouce(new Souce("1000 ostrovov", "belij"));
    }
}
