package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskFF {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        insertSort(bufferedReader.readLine().split("\\ "));
    }

    public static void insertSort(String[] arr)
    {
        String temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])){
                    temp = arr[i];
                    System.arraycopy(arr, j, arr, j + 1, i - j);
                    arr[j] = temp;
                    break;
                }
            }
        }
        for (String elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
