package Task9;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int counter = 0;
        arr[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > arr[i - 1]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
