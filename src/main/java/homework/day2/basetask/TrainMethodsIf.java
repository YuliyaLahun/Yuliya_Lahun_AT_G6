package basetask;

public class TrainMethodsIf {

    public double returnNewInt(int x) {
        if (x < 8) {
            return x * 7;
        } else {
            return (double) x / 4;
        }
//        return x < 8 ? x * 7 : (double) x / 4;
    }

    public long returnNewLong(long x) {
        if (x > 300) {
            return x - 300;
        }
        return x + 20;
    }
//        return x > 300 ? x - 300 : x + 20;

    public String returnNewChar(char x) {
//        if (x == 'g') {
//            return x + "o";
//        }
//        return "o" + x;
        return x == 'g' ? x + "o" : "o" + x;
    }

    public float returnNewFloat(float x) {
//        if (Float.compare(x, 0.67f) == 0) {
//            return x;
//        } else
//            return x * 2;
        return Float.compare(x, 0.67f) == 0 ? x : x * 2;
    }

    public double returnNewDouble(double x) {
        if (Double.compare(x, 30) == 1 && Double.compare(x, 80) == -1) {
            return x + 87;
        } else if (Double.compare(x, 80) == 1 && Double.compare(x, 400) == -1) {
            return x - 87;
        } else if (Double.compare(x, 400) == 1) {
            return x / 4;
        }
        return x;
    }


    public void returnNewBoolean(boolean x) {
        if (x) {
            System.out.println("Я получил на вход значение истины");
        } else
            System.out.println("Я получил на вход ложь");
    }
}



