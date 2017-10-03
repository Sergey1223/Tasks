package Task8;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int divider = b * d;
        int dividend = a * d + b * c;
        for (int i = ((dividend < divider) ? dividend : divider); i > 1 ; i--) {
            if(dividend % i == 0 && divider % i == 0){
                dividend /= i;
                divider /= i;
            }
        }
        System.out.println(dividend + " " + divider);
    }
}
