package Task4;

import java.util.Scanner;

public class TaskZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[4];
        while (num > 35){
            num -= 60;
            arr[3]++;
        }
        while (num > 17){
            num -= 20;
            arr[2]++;
        }
        while (num > 8){
            num -= 10;
            arr[1]++;
        }
        while (num > 4){
            num -= 5;
            arr[0]++;
        }
        if(num < 0){
            System.out.println(0 + " " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
        else {
            System.out.println(num + " " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}
