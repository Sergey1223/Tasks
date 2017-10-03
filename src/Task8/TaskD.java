package Task8;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskD {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        int i, k;
        for (i = n; i > 0; i--) {
            if(summ + i * i <= n && processor(n, n, false) < 5) {
                System.out.println(i);
                summ += i * i;
                summ += i * i;
                i = n - summ + 1;
            }
            else {
                k = i - 1;
                while (processor(n, k, false) > 4){
                    k--;
                }
                processor(n, k, true);
                break;
            }
        }
    }

    private static int processor(int n, int k, boolean flag) {
        int summ = 0;
        int counter = 0;
        int i;
        for (i = k; i > 0; i--) {
            if(summ + i * i <= n){
                if(flag)System.out.println(i);
                counter++;
                summ += i * i;
                i = n - summ + 1;
            }
        }
        return counter;
    }

}
