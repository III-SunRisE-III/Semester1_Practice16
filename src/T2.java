/*
Показать на экране все строки файла,
содержащие указанную строку в качестве подстроки.
Если таких нет, то сообщить об этом.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        StringStorage stringStorage = new StringStorage("D:\\IntelliJ IDEA\\Projects\\Main\\src\\semester1\\practice\\PlaceHolder.txt");

        ArrayList<String> arrayList = stringStorage.loadFromFile();

        System.out.print("Введите подстроку, которую вы ищете в файле: ");
        String sub = s.nextLine();

        int counter = 0;
        for (String str : arrayList) {
            if (str.contains(sub)) System.out.println(str);
            else counter++;
        }

        if (counter == arrayList.size()) System.out.println("Подстрока не найдена");
    }
}
