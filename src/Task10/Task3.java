package Task10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(countMax(arr, max));
    }

    public static int countMax(int[] arr, int max)
    {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                counter++;
            }
        }
        return counter;
    }
}
