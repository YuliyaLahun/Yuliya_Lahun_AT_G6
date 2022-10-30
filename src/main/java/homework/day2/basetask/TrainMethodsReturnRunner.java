package homework.day2.basetask;


public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод " + "returnNewInt " + trainMethodsReturn.returnNewInt(3));
        System.out.println("метод " + "returnNewLong " + trainMethodsReturn.returnNewLong(3));
        System.out.println("метод " + "returnNewChar " + trainMethodsReturn.returnNewChar('a'));
        System.out.println("метод " + "returnNewByte " + trainMethodsReturn.returnNewByte((byte) 1));
        System.out.println("метод " + "returnNewShort " + trainMethodsReturn.returnNewShort((short) 5));
        System.out.println("метод " + "returnNewDouble " + trainMethodsReturn.returnNewDouble(1.2345));
        System.out.println("метод " + "returnNewFloat " + trainMethodsReturn.returnNewFloat((float) 2.3));
        System.out.println("метод " + "returnNewBoolean " + trainMethodsReturn.returnNewBoolean(false));


//        Method[] declaredMethods = TrainMethodsReturn.class.getDeclaredMethods();
//        Arrays.stream(declaredMethods)
//                .collect(Collectors.toMap(Method::getName, Method::ge))
//                .forEach((s, aClass) -> System.out.printf("method %s returns %s%n", s, aClass));

//        for(Method method : TrainMethodsReturn.class.getDeclaredMethods()){
//            System.out.println("метод " + method.getName() + " вернул " + trainMethodsReturn.returnNewInt(3));
//    }
    }
}
