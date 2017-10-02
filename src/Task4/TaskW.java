package Task4;

import java.util.Scanner;

public class TaskW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        if(arr[0] + arr[1] > arr[2] && arr[0] + arr[2] > arr[1] && arr[1] + arr[2] > arr[0]){
            int max = arr[0];
            byte index = 0;
            for (byte i = 1; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                    index = i;
                }
            }
            int summ = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index){
                    summ += (arr[i] * arr[i]);
                }
            }
            if((arr[index] * arr[index]) == summ){
                System.out.print("right");
            }
            else if((arr[index] * arr[index]) < summ){
                System.out.print("acute");
            }
            else {
                System.out.print("obtuse");
            }
        }
        else {
            System.out.println("impossible");
        }
    }
}
