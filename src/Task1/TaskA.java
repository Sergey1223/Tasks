package Task1;

public class TaskA {
    public static void main(String[] args) {
        int a = 13/5, b = 13%5, c = (int)13.0/5, i = (int)(13.0/5 + 2.0/5);
        double d = 13/5, e = 13%5, f = 13.0/5, g = 13/5 + 2/5, h = 13.0/5 + 2.0/5;
        System.out.println("a = 13/5 - " + a + " (результат деления приводится к типу операндов (int), дробная часть отбрасывается).");
        System.out.println("b = 13%5 - " + b + " (остаток от целочисленного деления).");
        System.out.println("c = 13.0/5 - " + c + " (результат деления приводится к типу переменной (int)).");
        System.out.println("d = 13/5 - " + d + " (результат от деления приводится к типу операндов (int), то есть дробная" +
                " часть отбрасывается, затем результат приводится к типу переменной (double)).");
        System.out.println("e = 13%5 - " + e + " (аналагично 'd').");
        System.out.println("f = 13.0%5 - " + f + " (результат деления приводится к типу операндов (double)).");
        System.out.println("g = 13/5 + 2/5 - " + g + " (аналагично 'd').");
        System.out.println("h = 13.0/5 + 2.0/5 - " + h + " (аналагично 'f').");
        System.out.println("i = (int)(13.0/5 + 2.0/5 - " + i + " (результат 'h' явно приводится к типу int).");
    }
}