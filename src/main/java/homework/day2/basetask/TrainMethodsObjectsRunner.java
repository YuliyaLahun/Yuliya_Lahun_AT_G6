package homework.day2.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

        basetask.TrainMethodsObjects trainMethodsObjects = new basetask.TrainMethodsObjects();
        trainMethodsObjects.processBee(new basetask.Bee("male", 20));
        trainMethodsObjects.processMouse(new basetask.Mouse("Mini", 3));
        trainMethodsObjects.processObstacle(new basetask.Obstacle("description", "critical"));
        trainMethodsObjects.processPineapple(new basetask.Pineapple("grade", 2140.1));
        trainMethodsObjects.processSouce(new basetask.Souce("1000 ostrovov", "belij"));
    }
}
