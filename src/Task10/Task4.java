package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        digitsCounts(bufferedReader.readLine().split("\\ "));
    }

    public static void digitsCounts(String[] arr)
    {
        int[] temp = new int[9];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if(Integer.parseInt(arr[j]) == (i + 1)){
                    temp[i]++;
                }
            }
        }
        for (int elem : temp) {
            System.out.print(elem + " ");
        }
    }
}
