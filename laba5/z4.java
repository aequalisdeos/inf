import java.util.Scanner;
import static java.lang.Math.*;
public class z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную x");
        double x = in.nextDouble(), y;
        if (x<-2)
            y = exp(1) + PI*x;
        else if (x>-2 & x<2)
                y = cos(sin(x));
            else if(x>2)
                y = exp(cos(sin(cos(x))));
            else
                y = exp(1);
            System.out.printf("y = %.10f", y);
    }
}
