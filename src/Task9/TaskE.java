package Task9;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 1; i < n; i++) {
            if(arr[i] * arr[i - 1] >= 0){
                System.out.println("YES");
                break;
            }
        }
        if(i == n){
            System.out.println("NO");
        }
    }
}
