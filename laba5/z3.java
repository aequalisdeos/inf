import java.util.Scanner;
import static java.lang.Math.*;
public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную x в диапазоне [-3;3] с шагом 0,5");
        double x = in.nextDouble(), f;
        if (x >= -3 & x <= 3) {
            if (x>=-1)
                f = cos(x) + sin(x);
            else
                f = -(pow(x+1, 2));
            System.out.println("f = " + f);
        } else
            System.out.println("Вы ввели данные не из диапазона [-3;3]");
    }
}
