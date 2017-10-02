package Task3;

import java.io.*;

public class Files {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        Writer writer = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("out\\production\\files\\input.txt"));
            String[] numbers = bufferedReader.readLine().split("\\ ");
            long result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            writer = new FileWriter("out\\production\\files\\output.txt");
            writer.append(Long.toString(result));

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
            writer.close();
        }

    }
}
