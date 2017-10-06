package Task11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(compare(scanner.nextLine(), scanner.nextLine()));
    }

    private static String compare(String str1, String str2){
        if(str1.equals(str2)){
            return "YES";
        }
        else return "NO";
    }
}
