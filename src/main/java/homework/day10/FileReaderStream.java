package homework.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderStream {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        String newLine = lines.stream()
                .skip(4)
                .reduce((x, y) -> x + y)
                .get();


        List<String> newLines = Arrays.asList(newLine.split("<br>"));

        Date date = new Date();

        System.out.println(newLines
                .stream()
                .filter(x -> x.startsWith("Date log:"))
                .map(x -> x.substring(0, 20))
                .map(x -> x + date)
                .collect(Collectors.toList()));

    }
}
