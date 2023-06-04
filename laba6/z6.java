import java.util.Scanner;
import static java.lang.Math.*;
public class z6 {
    public static class Oblast {
        public static boolean Koord(double x, double y)
        {
            return ((x>=(-5) & (x<=(-2)) & y<=4.0/3*x+20.0/3 & y>=0) & (x>=(-2) & x<=0 & y<=4 & y>=1.0/2*x+1) & (!((pow((x+2), 2)+pow((y-2),2))<=1)) & !(y<=sqrt(36-pow(x,2)) & y>=-3.0/2*x+4) & (!(x>=0 & x<=2 & y<=sqrt(1-pow((x-2),2))+4 & y>=-sqrt(1-pow((x-2),2))+4)) & (x>=2 & x<=5 & y<=sqrt(36-pow(x,2)) & y>=1.0/3*x+1.0/3) & (!(x>=2 & x<=5 & y<=sqrt(1-pow((x-2),2))+4 & y>=-sqrt(1-pow((x-2),2))+4)) & (x>=5 & x<=6 & y<=sqrt(36-pow(x,2)) & y>=0));
        }
    }
    public static boolean getOtv() {
        System.out.println("Проверить точки? Да - 1");
        Scanner in = new Scanner(System.in);
        int otv = in.nextInt();
        return otv == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean otv = getOtv();
        while (otv) {
            System.out.println("Введите координаты точки");
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(Oblast.Koord(x, y));
            otv = getOtv();
        }
    }
}

