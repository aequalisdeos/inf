import java.util.Scanner;
import static java.lang.Math.*;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r, k, u, x1, x2, y1, y2;
        System.out.println("Введите радиус окружности r");
        r = in.nextDouble();
        System.out.println("Введите тангенс угла наклона k");
        k = in.nextDouble();
        u = atan(k);
        x1 = r*cos(u);
        y1 = r*sin(u);
        x2 = -x1;
        y2 = -y1;
        System.out.println("Прямая и окружность пересекаются в точках");
        System.out.println(x1 + ":" +y1);
        System.out.println(x2+ ":" +y2);
    }
}
