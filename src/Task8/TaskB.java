package Task8;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(mbd(n, m));*/
    }

    private static int mbd(int n, int m){
        if(m % n == 0){
            return n;
        }
        else return mbd(m % n, n);
    }

}
