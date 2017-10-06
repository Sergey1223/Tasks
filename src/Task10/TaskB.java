package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskB {
    public static void main(String[] args) throws IOException {
        String[] arr = new BufferedReader(new FileReader("input.txt")).readLine().split("\\ ");
        System.out.println(lastMax(arr));
    }

    public static int lastMax(String[] arr)
    {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) >= max){
                max = Integer.parseInt(arr[i]);
                index = i;
            }
        }
        System.out.println(max);
        return index;
    }
}
