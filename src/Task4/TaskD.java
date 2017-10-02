package Task4;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.print(1);
        }
        else if(x == 0){
            System.out.print(0);
        }
        else {
            System.out.println(-1);
        }
    }
}
