package Task4;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        if (numberOne > numberTwo) {
            System.out.print(1);
        }
        else if(numberOne == numberTwo){
            System.out.print(0);
        }
        else {
            System.out.println(2);
        }
    }
}
