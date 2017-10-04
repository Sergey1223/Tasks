package Task9;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
