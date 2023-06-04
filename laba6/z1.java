import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.out;
public class z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.println("Введите m");
        double m = in.nextDouble();
        out.println("Введите n");
        double n = in.nextDouble();
        out.println("Введите x");
        double x = in.nextDouble();
        double sum1 = 0;
        double sum2 = 0;
        double i = 0;
        while (i<n) {
            sum1 += pow(x, n)/ getFactorial(n);
            i += 1;
        }
        while (n>1){
            if ((pow(x, n)/ getFactorial(n))<m)
                sum2 += pow(x, n)/ getFactorial(n);
            n -= 1;
        }
        out.println("Сумма первых N членов ряда - " + sum1);
        out.println("Сумма членов ряда, которые меньше заданного числа M - " + sum2);
    }
    public static double getFactorial(double f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f-1);
        }
    }
}
