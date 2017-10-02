package Task5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextByte();
        int end = scanner.nextByte();
        for (int i = start; i <= end; i++) {
            if((i << 31) >> 31 == 0){
                System.out.println(i);
            }
        }
    }
}
