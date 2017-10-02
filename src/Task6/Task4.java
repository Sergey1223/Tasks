package Task6;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new FileReader("input.txt")));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int[] arr = {6, 28, 496, 8128, 33550336};
        streamTokenizer.nextToken();
        int start = (int) streamTokenizer.nval;
        streamTokenizer.nextToken();
        int end = (int) streamTokenizer.nval;
        boolean absent = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= start){
                for (int j = i; j < arr.length && arr[j] <= end; j++) {
                    printWriter.println(arr[j]);
                    printWriter.flush();
                    absent = false;
                }
                break;
            }
        }
        if(absent){
            printWriter.println("Absent");
            printWriter.flush();
        }
    }
}
