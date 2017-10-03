package Task7;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        System.out.println(powerTwo(new Scanner(System.in).nextInt()));
    }

    private static String powerTwo(int number){
        while (number > 1){
            if((number & 1) == 1){
                return "NO";
            }
            else {
                number /= 2;
            }
        }
        return "YES";
    }
}
