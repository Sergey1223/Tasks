package Task6;

import java.util.Scanner;

public class AlgorithmEvklid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        while (one != 0 && two != 0){
            if(one > two){
                one = one % two;
            }
            else {
                two = two % one;
            }
        }
        System.out.println(one + two);
    }
}
