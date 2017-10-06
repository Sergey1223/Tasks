package Task10;

import java.util.Random;
import java.util.Scanner;

public class Task16 {
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
        int[] temp = localMax(arr);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    private static int[] localMax(int[] arr){
        int counter = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                counter++;
            }
        }
        int[] temp = new int[counter];
        int j = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                temp[j++] = arr[i];
            }
        }
        return temp;
    }
}
