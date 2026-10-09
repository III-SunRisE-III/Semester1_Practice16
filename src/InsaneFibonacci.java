/*
В файле записана последовательность чисел
фибоначчи, дописать ещё n чисел последовательности.
 */

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InsaneFibonacci {
    public static void main(String[] args) throws IOException {
        FibonacciSequenceFromFile fib = new FibonacciSequenceFromFile("fib.txt");

        fib.writeNFibNumsToFile(new Random().nextInt(7, 71));

        Scanner s = new Scanner(System.in);

        System.out.println("\nЗдесь считается, что последовательность Фибоначчи начинается с 1.");
        System.out.print("Напишите, сколько ещё чисел последовательности дописать: ");
        int n = s.nextInt();

        List<Long> arr = fib.fibonacciSequenceFromElem(n);
        fib.writeNumsToFile(arr);

        System.out.println("\n" + n + " указанных ниже элементов дописано в файл:");
        System.out.println(arr);
    }
}
