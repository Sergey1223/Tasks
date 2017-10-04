package Task9;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int counter = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if(temp > 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
