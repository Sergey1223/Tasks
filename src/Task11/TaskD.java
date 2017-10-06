package Task11;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringss = scanner.nextLine().split("\\ ");
        String max = "";
        for (int i = 0; i < stringss.length; i++) {
            if(stringss[i].length() > max.length()){
                max = stringss[i];
            }
        }
        System.out.println(max);
        System.out.println(max.length());
    }
}
