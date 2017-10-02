package Task6;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = a; i <= b; i++) {
            if((i & 1) == 0){
                stringBuilder.append(i + " ");
            }
        }
        System.out.println(stringBuilder);
    }
}
