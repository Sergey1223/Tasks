package Task11;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i + 1).indexOf(str.charAt(i)) > -1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
