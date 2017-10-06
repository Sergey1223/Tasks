package Task10;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
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
        int i = arr.length - 1;
        while (i >= 0){
            System.out.print(i + " (" + arr[i] + ") ");
            i--;
        }
    }
}
