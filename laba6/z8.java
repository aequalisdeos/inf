import java.util.Scanner;
import static java.lang.Math.*;
public class z8 {
    public static class FunctionMy {
        public static double FunctionMy1(double y){
            double k = 10;
            return ((log(k-y)+pow(y,4))/(pow(exp(1), y) + 2.355*pow(k, 2)));
        }
        public static double FunctionMy2(double y){
            double x = 10, z = 10;
            return ((tan(pow(x, 4) - 6)- pow(cos(z + x*y), 3))/(pow(cos(pow(x, 3) + pow(sin(PI + x), 3)), 4)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        while (n < 10) {
            System.out.println("Введите y");
            double y = sc.nextDouble();
            sum += FunctionMy.FunctionMy1(y) + FunctionMy.FunctionMy2(y);
            n++;
        }
        System.out.println(sum);
    }
}
