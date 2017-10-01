package Task1;

import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        int temp = Math.abs(speed * time);
        while (temp > 109 ){
            temp -= 109;
        }
        if(speed < 0){
            System.out.println(109 - temp);
        }
        else {
            System.out.println(temp);
        }
    }
}
