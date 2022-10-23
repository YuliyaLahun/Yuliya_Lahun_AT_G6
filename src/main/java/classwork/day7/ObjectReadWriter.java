package classwork.day7;


import java.io.*;

public class ObjectReadWriter {

    public static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("t.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("Vas", 33, 180, 90));
        oos.close();
    }


    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("t.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);
    }

}
