package Task11;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replace(" ", "");
        if(reverse(str).equals(str)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }

    private static String reverse(String str){
        String temp = "";
        if(str.length() == 1){
            return str;
        }
        else {
            temp += str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
            return temp;
        }
    }
}
