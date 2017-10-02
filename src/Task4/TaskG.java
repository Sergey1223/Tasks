package Task4;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();
        if (numberOne == numberThree || numberTwo == numberFour){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
