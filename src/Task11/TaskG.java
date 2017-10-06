package Task11;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str2.indexOf(str1) > -1){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
