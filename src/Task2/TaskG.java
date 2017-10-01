package Task2;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();
        int mask = Integer.MAX_VALUE;
        for (int j = 0; j < i; j++) {
            mask <<= 1;
            if(j > 0){
                mask += 1;
            }
        }
        System.out.print(a & mask);
    }
}
