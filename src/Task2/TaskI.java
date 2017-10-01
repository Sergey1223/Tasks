package Task2;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();
        int mask = Integer.MAX_VALUE;
        for (int j = 0; j < i + 1; j++) {
            mask <<= 1;
            if(j > 0){
                mask += 1;
            }
        }
        if ((a & mask) == a){
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
}
