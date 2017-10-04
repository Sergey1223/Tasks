package Task9;

import java.util.Scanner;

public class TaskEE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPrime(scanner.nextInt()));
    }

    private static String isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return "composite";
            }
        }
        return "prime";
    }
}