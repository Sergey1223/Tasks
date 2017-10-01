package Task2;

import java.math.BigInteger;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        BigInteger two = new BigInteger("2");
        System.out.println(two.shiftLeft(power - 1));
    }
}