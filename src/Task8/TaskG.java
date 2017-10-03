package Task8;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if(check(i) && check(n - i)){
                System.out.println(i + " " + (n - i));
                break;
            }
        }
    }

    private static boolean check(int n){
        int i;
        for (i = 2; i < n; i++) {
            if(n % i == 0){
                break;
            }
        }
        if(i != n) {
            return false;
        }
        else return true;
    }
}
