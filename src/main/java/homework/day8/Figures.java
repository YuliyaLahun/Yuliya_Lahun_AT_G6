package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        //should we commit output files
        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        for (String s : figures) {
            out.write(s + " - ");
        }
        out.close();

        int counter = 0;
        for (String s : figures) {
            if (!s.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        figures.add(3, "Треугольник");

        System.out.println(); //for better view of printed figures
        for (String s : figures) {
            System.out.print(s + " ");
        }
    }
}
