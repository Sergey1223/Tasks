package Task10;

import java.io.IOException;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[9];
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        while (temp != 0){
            for (int i = 0; i < arr.length; i++) {
                if(temp == i + 1){
                    arr[i]++;
                }
            }
            temp = scanner.nextInt();
        }
        for (int elem : arr) {
            System.out.println(elem);
        }
    }

}
