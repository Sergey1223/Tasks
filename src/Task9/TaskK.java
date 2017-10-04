package Task9;

import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextShort();
        int counter = 1;
        int i, temp, temp1;
        temp = scanner.nextInt();
        for (i = 1; i < n; i++) {
            temp1 = scanner.nextInt();
            if(temp != temp1){
                temp = temp1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
