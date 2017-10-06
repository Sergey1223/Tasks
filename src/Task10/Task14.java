package Task10;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        clampArr(arr, 3, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void clampArr(int[] arr, int min, int max){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                arr[i] = min;
                continue;
            }
            if(arr[i] > max){
                arr[i] = max;
            }
        }
    }
}
