package Task10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println(search(arr, scanner.nextInt()));
    }

    public static int search(int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
