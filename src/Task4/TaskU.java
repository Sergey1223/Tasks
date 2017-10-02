package Task4;

import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne == numberTwo){
            if(numberTwo == numberThree){
                System.out.print(3);
            }
            else {
                System.out.println(2);
            }
        }
        else if(numberTwo == numberThree || numberOne == numberThree) {
                System.out.print(2);
            }
        else {
            System.out.println(0);
        }
    }
}
