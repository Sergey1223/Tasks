package Task9;

import java.util.Scanner;

public class TaskAAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOfDigits(scanner.nextInt()));
    }

    private static int sumOfDigits(int n){
        int summ = 0;
        if(n > 9){
            summ += n - n/10*10 + sumOfDigits(n/10);
            return summ;
        }
        else {
            summ += n;
            return summ;
        }
    }
}
