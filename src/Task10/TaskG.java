package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskG {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        bubbleSort(bufferedReader.readLine().split("\\ "));
    }

    public static void bubbleSort(String[] arr)
    {
        String temp;
        for (int i = arr.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[j + 1])){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
