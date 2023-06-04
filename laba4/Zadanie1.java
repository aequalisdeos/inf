import java.util.Scanner;
import static java.lang.Math.*;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z, k, u, g;
        System.out.println("Введите переменную x");
        x = in.nextDouble();
        System.out.println("Введите переменную y");
        y = in.nextDouble();
        System.out.println("Введите переменную z");
        z = in.nextDouble();
        System.out.println("Введите переменную k");
        k = in.nextDouble();
        u =  ((log(k-y)+pow(y,4))/(pow(exp(1), y) + 2.355*pow(k, 2)));
        System.out.println("u = " + u);
        g = ((tan(pow(x, 4) - 6)- pow(cos(z + x*y), 3))/(pow(cos(pow(x, 3) + pow(sin(PI + x), 3)), 4)));
        System.out.println("g = " + g);
    }
}
