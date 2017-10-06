package Task10;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        shuffleArr(arr);
        System.out.println();
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    private static void shuffleArr(int[] arr){
        Random random = new Random();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = random.nextInt(arr.length);
            while (temp == i){
                temp = random.nextInt(arr.length);
            }
            arr[i] ^= arr[temp];
            arr[temp] ^= arr[i];
            arr[i] ^= arr[temp];
        }
    }
}
