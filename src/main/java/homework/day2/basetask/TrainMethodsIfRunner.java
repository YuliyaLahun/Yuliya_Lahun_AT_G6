package homework.day2.basetask;


public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод " + "returnNewInt" + " вернул " + trainMethodsIf.returnNewInt(8));
        System.out.println("метод " + "returnNewLong" + " вернул " + trainMethodsIf.returnNewLong(301));
        System.out.println("метод " + "returnNewChar" + " вернул " + trainMethodsIf.returnNewChar('i'));
        System.out.println("метод " + "returnNewFloat" + " вернул " + trainMethodsIf.returnNewFloat(0.67f));
        System.out.println("метод " + "returnNewDouble" + " вернул " + trainMethodsIf.returnNewDouble(600));
        trainMethodsIf.returnNewBoolean(false);

    }
}
