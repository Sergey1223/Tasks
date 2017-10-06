package Task10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(power(scanner.nextInt(), scanner.nextInt()));
    }

    static int power(int a, int n){
        if(n == 0){
            return a;
        }
        else return a * power(a, n - 1);
    }
}
