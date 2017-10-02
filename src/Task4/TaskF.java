package Task4;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo) {
            if(numberThree > numberOne){
                System.out.println(numberThree);
            }
            else {
                System.out.println(numberOne);
            }
        }
        else if(numberTwo > numberThree) {
            System.out.print(numberTwo);
        }
        else {
            System.out.print(numberThree);
        }
    }
}
