import java.util.Scanner;
import static java.lang.Math.*;
public class z1 {
    public static void main(String[] args) {
        Scanner qwe = new Scanner((System.in));
        double x1, y1, x2, y2, x3, y3, s, p, l, u;
        System.out.println("Введите координаты первой точки");
        x1 = qwe.nextDouble();
        y1 = qwe.nextDouble();
        System.out.println("Введите координаты второй точки");
        x2 = qwe.nextDouble();
        y2 = qwe.nextDouble();
        System.out.println("Введите координаты третьей точки");
        x3 = qwe.nextDouble();
        y3 = qwe.nextDouble();
        s = ((0.5)*((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)));
        p = ((x1-x2)*(x3-x2)+(y1-y2)*(y3-y2));
        l = ((sqrt(pow(x1-x2, 2) + pow(y1-y2, 2)))*(sqrt(pow(x3-x2, 2) + pow(y3-y2, 2))));
        u = acos(p/l);
        if (s==0)
            System.out.println("Точки лежат на одной прямой");
        else
            System.out.println("Точки не лежат на одной прямой. " + "Угол ABC = " + u);
    }
}
