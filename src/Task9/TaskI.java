package Task9;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[n - 1];
        System.arraycopy(arr, 0, arr, 1, arr.length - 1);
        arr[0] = temp;
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
