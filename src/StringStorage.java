import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StringStorage {
    private final String fileName;

    public StringStorage(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<String> loadFromFile() throws IOException {
        try (Scanner s = new Scanner(new FileInputStream(fileName))) {
            s.useDelimiter(" +");
            ArrayList<String> list = new ArrayList<>();
            while (s.hasNextLine()) {
                list.add(s.nextLine());
            }
            return list;
        }
    }
}
