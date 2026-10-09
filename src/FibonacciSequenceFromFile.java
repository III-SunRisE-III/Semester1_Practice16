import semester1.lectures.last_lecture15_16.StringStorage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequenceFromFile {
    String filename;

    public FibonacciSequenceFromFile(String filename) {
        this.filename = filename;
    }

    public ArrayList<Long> generateNFibNums(int n) {
        ArrayList<Long> arr = new ArrayList<>(n);
        arr.add(1L);
        arr.add(1L);

        for (int i = 2; i < n; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }

        return arr;
    }

    public void writeNFibNumsToFile(int n) throws IOException {
        StringStorage strStore = new StringStorage(filename);
        strStore.clear();
        for (Long num: generateNFibNums(n)) {
            strStore.saveToFile(num.toString());
        }
    }
    public void writeNumsToFile(List<Long> arr) throws IOException {
        StringStorage strStore = new StringStorage(filename);
        for (Long num: arr) {
            strStore.saveToFile(num.toString());
        }
    }

    public List<Long> fibonacciSequenceFromElem(int n) throws IOException {
        ArrayList<Long> arr = loadFibonacciSequence();
        int size = arr.size();

        for (int i = size; i < (size + n); i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }

        return arr.subList(size, size + n);
    }

    public ArrayList<Long> loadFibonacciSequence() throws IOException {
        StringStorage strStore = new StringStorage(filename);
        return strStore.loadLongsFromFile();
    }
}
