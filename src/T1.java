/*
Написать программу, которая считывает текст
из файла, которая определяет, сколько в ней слов,
состоящей из не более чем 4 букв
 */

import java.io.IOException;
import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) throws IOException {
        StringStorage stringStorage = new StringStorage("D:\\IntelliJ IDEA\\Projects\\Main\\src\\semester1\\practice\\PlaceHolder.txt");

        ArrayList<String> arrayList = stringStorage.loadFromFile();

        long counter = 0;
        for (String i : arrayList) {
            i = i.replaceAll("[^a-zA-Zа-яА-Я]+", " ");
            String[] splitStr = i.split(" ");
            for (String j : splitStr) {
                if ((j.length() <= 4) && (!j.isEmpty())) counter++;
            }
        }

        System.out.println("Количество слов, состоящих из 4 и менее букв составляет: " + counter);
    }
}
