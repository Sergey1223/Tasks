package Task9;

import java.util.Scanner;

public class Task119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if(Integer.toString(i).equals(reverse(i))){
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static String reverse(int n){
        String str = "";
        if(n > 9){
            str += Integer.toString(n - n/10*10) + reverse(n/10);;
            return str;
        }
        else {
            str += Integer.toString(n);
            return str;
        }
    }
}
