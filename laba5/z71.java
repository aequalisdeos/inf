import java.util.Scanner;
import static java.lang.Math.*;
public class z71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную x в диапазоне [-4;4]");
        double x = in.nextDouble(), g;
        if (x >= -4 & x <= 4) {
            if ((x <= 0) & ((10 + pow(tan(x), 3))!=0) & (x!=(-4)) & (x!=(-1))) {
                g = 2 * pow(x, 2) + (3 * x + pow(sin(2 * x), 2 * exp(1))) / (10 + pow(tan(x), 3));
                System.out.println("g = " + g);
            } else if ((x > 0) & ((1 + 2 * sin(x))>0)) {
                g = 2 * exp(1) + sqrt(1 + 2 * sin(x));
                System.out.println("g = " + g);
            } else
                System.out.println("Введённое значение не подходит");
        } else
            System.out.println("Вы ввели данные не из дапозона [-4;4]");
    }
}

