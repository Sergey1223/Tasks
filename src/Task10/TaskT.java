package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskT {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String[] arr1 = bufferedReader.readLine().split("\\ ");
        String[] arr2 = bufferedReader.readLine().split("\\ ");
        intersection(arr1, arr2);
    }

    public static void intersection(String[] arr1, String[] arr2)
    {
        int j = 0, k = 0;
        while (j != arr1.length && k != arr2.length){
            if(Integer.parseInt(arr2[k]) < Integer.parseInt(arr1[j])){
                k++;
            }
            else {
                if(Integer.parseInt(arr1[j]) == Integer.parseInt(arr2[k])){
                    System.out.print(arr1[j] + " ");
                }
                j++;
            }
        }
    }
}
