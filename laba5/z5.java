import java.util.Scanner;
import static java.lang.Math.*;
public class z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату точки x");
        double x = in.nextDouble();
        System.out.println("Введите координату точки y");
        double y = in.nextDouble();
        int f1 = 0;
        int f2 = 0;
        if (x>=(-5) & x<=(-4) & y<=x+4 & y>=-x-6)
            f1++;
        if (x>=(-4) & x<=(-3) & y<=x+4 & y>=2*x+6)
            f1++;
        if (x>=(-3) & x<=(-2) & (y<=sqrt(4-pow((x+1),2))+1 & y>=-2*x-6))
            f1++;
        if (x>=(-2) & x<=(-1) & (y<=sqrt(4-pow((x+1),2))+1 & y>=x))
            f1++;
        if (x>=(-1) & x<=0 & ((y<=2.0/3*x+11.0/3 & y>=5.0/3*x+5.0/3) | (y<=x+1 & (pow((x+1),2)+pow((y-1),2))<=4)))
            f1++;
        if (x>=0 & x<=1)
            if ((y<=2.0/3*x+11.0/3 & y>=5.0/3*x+5.0/3) | (y<=x+1 & (pow((x+1),2)+pow((y-1),2))<=4)) {
                f1++;
            } else if (y<=1.0/2*x-5 & y>=1.0/4*x-5)
                f2++;
        if (x>=1 & x<=2)
            if ((y<=2.0/3*x+11.0/3 & y>=5.0/3*x+5.0/3) | (y<=x+1 & y>=1.0/3*x+2.0/3)) {
                f1++;
            } else if (y<=1.0/2*x-5 & y>=1.0/4*x-5)
                f2++;
        if (x>=2 & x<=3)
            if (y<=x+1 & y>=1.0/3*x+2.0/3) {
                f1++;
            } else if ((y<=-x+1 & (pow((x-4),2)+pow((y+1),2))<=4) | (y<=1.0/2*x-5 & y>=1.0/4*x-5))
                f2++;
        if (x>=3 & x<=4)
            if (y<=x+1 & y>=1.0/3*x+2.0/3) {
                f1++;
            } else if ((y<=x-5 & pow((x-4),2)+pow((y+1),2)<=4) | (y<=1.0/2*x-5 & y>=1.0/4*x-5))
                f2++;
        if (x>=4 & x<=5)
            if (y<=-1.0/2*x+7 & y>=x-2) {
                f1++;
            } else if ((pow((x-4),2)+pow((y+1),2)<=4 & y>=-x+5) | (y<=0 & y>=-2) | (y<=-3*x+10 & y>=-x))
                f2++;
        if (x>=5 & x<=6)
            if (y<=-1.0/2*x+7 & y>=x-2) {
                f1++;
            } else if (pow((x-4),2)+pow((y+1),2)<=4 & y>=-2)
                f2++;
        if (x>=6 & x<=7 & y<=-x+5 & y>=-2)
            f2++;
        if (f1>=1) {
            System.out.println("Точка попала в вверхнюю фигуру");
        } else if (f2>=1) {
            System.out.println("Точка попала в нижнюю фигуру");
        } else
            System.out.println("Точка никуда не попала");
    }
}