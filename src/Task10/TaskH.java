package Task10;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(processor(scanner.nextInt()));
    }

    private static int processor(int  n){
        if(n < 2){
            return 1;
        }
        else return processor(n - 1) + processor(n - 2);
    }
}
