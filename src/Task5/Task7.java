package Task5;

public class Task7 {
    public static void main(String[] args) {
        int temp;
        for (int i = 100; i < 1000; i++) {
            temp = i * i;
            if(((temp - (temp/1000) * 1000) == i)){
                System.out.println(i);
            }
        }
    }
}
