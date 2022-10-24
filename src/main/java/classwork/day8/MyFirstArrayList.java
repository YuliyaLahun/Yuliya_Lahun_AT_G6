package classwork.day8;


import java.util.ArrayList;
import java.util.List;

public class MyFirstArrayList {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        String inputString = "мама мыла раму мыла";
        String[] words = inputString.split(" ");
        for (String s : words) {
            myList.add(s);
        }
        for (String s : myList) {
            System.out.println(s);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


    }


}
