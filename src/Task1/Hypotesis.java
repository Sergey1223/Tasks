package Task1;

import java.util.Scanner;

public class Hypotesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short aCathetus = scanner.nextShort();
        short bCathetus = scanner.nextShort();
        System.out.println(Math.sqrt((aCathetus * aCathetus) + (bCathetus * bCathetus)));
    }
}
