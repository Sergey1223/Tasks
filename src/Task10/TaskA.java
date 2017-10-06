package Task10;

import java.util.Scanner;

// Ханойские башни
public class TaskA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processor(scanner.nextInt(), 1, 3, 2);
    }

    public static void processor(int rings, int source, int destination, int temp )
    {
        if ( rings == 1 )
        {
            System.out.printf( "%d %d %d\n", rings, source, destination );
            return;
        }
        processor( rings - 1, source, temp, destination );
        System.out.printf( "%d %d %d\n", rings, source, destination );
        processor( rings - 1, temp, destination, source );
    }
}
