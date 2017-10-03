package Task8;

import java.io.*;

public class TaskC {
    private static PrintWriter  printWriter;

    public static void main(String[] args) throws IOException {
        printWriter = new PrintWriter("output.txt");
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        streamTokenizer.nextToken();
        processor((int)streamTokenizer.nval);
        printWriter.flush();
    }

    private static void processor(int n) {
        int a = 2, k = 4;
        while (k <= n){
            while (n % a == 0){
                printWriter.print(a + " ");
                n /= a;
            }
            k += 2 * a + 1;
            a++;
        }
        if(n > 1){
            printWriter.print(n + " ");
        }
    }
}
