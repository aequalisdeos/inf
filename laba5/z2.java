import java.util.Scanner;
import static java.lang.Math.*;
public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, ax, bx, cx, min, max;
        System.out.println("Введите первое число");
        a = in.nextDouble();
        System.out.println("Введите второе число");
        b = in.nextDouble();
        System.out.println("Введите третье число");
        c = in.nextDouble();
        ax = abs(a);
        bx = abs(b);
        cx = abs(c);
        if (ax<bx & ax<cx) {
            min = ax;
        } else if (bx < ax & bx < cx) {
            min = bx;
        } else {
            min = cx;
        }
        if (ax>bx & ax>cx) {
            max = ax;
        } else if (bx > ax & bx > cx) {
            max = bx;
        } else {
            max = cx;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
