package basetask;


public class TrainMethodsReturn {

    public int returnNewInt(int x) {
        return x * 3;
    }

    public long returnNewLong(long x) {
        return x - 4;
    }

    public String returnNewChar(char x) {
        return x + "" + x;
    }

    public float returnNewFloat(float x) {
        return x / 2;
    }

    public double returnNewDouble(double x) {
        return x + 8;
    }

    public short returnNewShort(short x) {
        return (short) (x - 1);
    }

    public byte returnNewByte(byte x) {
        return (byte) (x * 2);
    }

    public boolean returnNewBoolean(boolean x) {
        return !x;
    }

}
