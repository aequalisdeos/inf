import java.util.Scanner;
import static java.lang.Math.*;
public class z72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную x в диапазоне [-4;4]");
        double x = in.nextDouble(), z;
        if (x >= -4 & x <= 4) {
            if (x < 0 & (cos(2 * x + 1) + (exp(pow(x, 2)) / (exp(1) + pow(x, 2)))) > 0) {
                z = sqrt(cos(2 * x + 1) + (exp(pow(x, 2)) / (exp(1) + pow(x, 2))));
                System.out.println("z = " + z);
            } else {
                if (x == 0 | x == 1) {
                    z = 2 * pow(cos(pow(sin(x), 3)), 2);
                    System.out.println("z = " + z);
                } else {
                    if (x > 1 & (1 / (x - 2) + abs(2 * sin(pow(3 * x, (0.25))))) > 0 & x != 2) {
                        z = sqrt(1 / (x - 2) + abs(2 * sin(pow(3 * x, (0.25)))));
                        System.out.println("z = " + z);
                    } else
                        System.out.println("Введённое значение не подходит");
                }
            }
        } else
            System.out.println("Вы ввели данные не из дапозона [-4;4]");
    }
}
