package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String[] arr1 = bufferedReader.readLine().split("\\ ");
        String[] arr2 = bufferedReader.readLine().split("\\ ");
        merge(arr1, arr2);
    }

    public static void merge(String[] arr1, String[] arr2)
    {
        String[] result = new String[arr1.length + arr2.length];
        int j = 0, k = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = (Integer.parseInt(arr1[j]) < Integer.parseInt(arr2[k])) ? arr1[j++] : arr2[k++];
            if(j == arr1.length){
                System.arraycopy(arr2, k, result, ++i, arr2.length - k);
                break;
            }
            if(k == arr2.length) {
                System.arraycopy(arr1, j, result, ++i, arr1.length - j);
                break;
            }
        }
        for (String elem : result) {
            System.out.printf("%s ", elem);
        }
    }
}
