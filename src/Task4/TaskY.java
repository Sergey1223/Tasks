package Task4;

import java.util.Scanner;

public class TaskY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[2];
        while (num > 34){
            num -= 60;
            arr[1]++;
        }
        while (num > 8){
            num -= 10;
            arr[0]++;
        }
        if(num < 0){
            System.out.println(0 + " " + arr[0] + " " + arr[1]);
        }
        else {
            System.out.println(num + " " + arr[0] + " " + arr[1]);
        }
    }
}
