package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskE {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        selectionSort(bufferedReader.readLine().split("\\ "));
    }

    public static void selectionSort(String[] arr)
    {
        int max;
        int index = 0, j;
        String temp;
        for (int i = 0; i < arr.length; i++) {
            max = Integer.MIN_VALUE;
            for (j = i; j < arr.length; j++) {
                if (Integer.parseInt(arr[j]) > max) {
                    max = Integer.parseInt(arr[j]);
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[index])){

            }
        }
        for (String elem : arr) {
            System.out.print(elem + " ");
        }
    }

}
