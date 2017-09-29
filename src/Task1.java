public class Task1 {

    public double method(short aCathetus, short bCathetus){
        System.out.println("Гипотенуза равна: ");
        return Math.sqrt((aCathetus * aCathetus) + (bCathetus * bCathetus));
    }

    public void methodA(){
        int a = 13/5, b = 13%5, c = (int)13.0/5, i = (int)(13.0/5 + 2.0/5);
        double d = 13/5, e = 13%5, f = 13.0/5, g = 13/5 + 2/5, h = 13.0/5 + 2.0/5;
        System.out.println("a - " + a);
        System.out.println("b - " + b);
        System.out.println("c - " + c);
        System.out.println("d - " + d);
        System.out.println("e - " + e);
        System.out.println("f - " + f);
        System.out.println("g - " + g);
        System.out.println("h - " + h);
        System.out.println("i - " + i);
    }

    public double methodB(double x) {
        double temp = x * x;                    // x^2
        return temp * temp;                     // x^4
    }


    public double methodC(double x) {
        double temp = x * x;                    // x^2
        double temp1 = temp * temp;             // x^4
        return temp * temp1;                    // x^6
    }

    public double methodD(double x) {
        return methodC(x) * x;                  // x^7
    }

    public double methodE(double x) {
        double temp = x * x;                    // x^2
        double temp1 = temp * temp;             // x^4
        temp = temp1 * temp1;                   // x^8
        double temp2 = temp * temp;             // x^16
        return temp2 * temp1 * x;               // x^21
    }

    public int methodF(int x){
        int tmp = x/10;
        return x - tmp * 10;
    }

    public int methodG(int x){
        return x/10;
    }

    public int methodH(int x){
        int tmp = x/100;
        return (x - tmp * 100)/10;
    }

    public int methodI(int x){
        int tmp = x;
        int summ = 0;
        for (int i = 0; i < 2; i++) {
            tmp /= 10;
            summ += (x - tmp * 10);
            x = tmp;
        }
        return summ + tmp;
    }

    public double methodJ(double speed, double time){
        double temp = speed * time;
        while (temp > 109){
            temp -= 109;
        }
        return temp;
    }

    public String methodK(int minunts){
        int hours = 0;
        while (minunts > 60){
            minunts -= 60;
            hours++;
            if (hours > 23) hours = 0;
        }
        return hours + " часов и " + minunts + " минут.";
    }

    public double methodL(int h, int m, int s){
        double angle = 30 * h + 0.5 * m + 0.25 * s;
        if(angle < 180) return angle;
        else return 360 - angle;
    }


}
