package Task9;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n/2; i++) {
            if(i != (n - i - 1)){
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
