package Task5;

import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\ ");
        double summ = 0;
        for (int i = 1; i <= Integer.parseInt(numbers[0]); i++) {
            summ += Integer.parseInt(numbers[i]);
        }
        System.out.println(summ);
    }
}
