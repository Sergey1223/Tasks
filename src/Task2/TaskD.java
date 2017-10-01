package Task2;

import java.math.BigInteger;
import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        BigInteger two = new BigInteger("2");
        BigInteger result;
        if(n < m){
            result =  two.shiftLeft(n - 1);
            System.out.println(result.add(result.shiftLeft(m - n)));
        }
        else {
            result =  two.shiftLeft(m - 1);
            System.out.println(result.add(result.shiftLeft(n - m)));
        }
    }
}
