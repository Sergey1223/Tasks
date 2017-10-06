package Task11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskH {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        int x = 0, y = 0;
        String temp = bufferedReader.readLine();
        while (temp != null){
            if(temp.contains("North")){
                y += Integer.parseInt(temp.substring(6));
            }
            else if (temp.contains("South")){
                y -= Integer.parseInt(temp.substring(6));
            }
            else if (temp.contains("West")){
                x -= Integer.parseInt(temp.substring(5));
            }
            else{
                x += Integer.parseInt(temp.substring(5));
            }
            temp = bufferedReader.readLine();
        }
        System.out.println(x + " " + y);
    }
}
