package Task2;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int mask = Integer.MAX_VALUE;
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < 8; j++) {
            mask <<= 1;
            if(j > 0){
                mask += 1;
            }
            if ((a & mask) == a){
                stringBuilder.append(0);
            }
            else {
                stringBuilder.append(1);
            }
        }
        System.out.println(stringBuilder.reverse());
    }
}
