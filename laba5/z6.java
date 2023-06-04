import java.util.Scanner;
import static java.lang.Math.*;
public class z6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату точки x");
        double x = in.nextDouble();
        System.out.println("Введите координату точки y");
        double y = in.nextDouble();
        int sch = 0;
        if (x>=(-5) & (x<=(-2)) & y<=4.0/3*x+20.0/3 & y>=0) {
            sch++;
        }
        if (x>=(-2) & x<=0 & y<=4 & y>=1.0/2*x+1) {
            sch++;
        }
        if (x>=(-3) & x<=(-1) & (pow((x+2), 2)+pow((y-2),2))<=1) {
            sch = 0;
        }
        if (x>=0 & x<=2 & y<=sqrt(36-pow(x,2)) & y>=-3.0/2*x+4) {
            if (x>=0 & x<=2 & y<=sqrt(1-pow((x-2),2))+4 & y>=-sqrt(1-pow((x-2),2))+4)
                sch=0;
            else
                sch++;
        }
        if (x>=2 & x<=5 & y<=sqrt(36-pow(x,2)) & y>=1.0/3*x+1.0/3) {
            if (x>=2 & x<=5 & y<=sqrt(1-pow((x-2),2))+4 & y>=-sqrt(1-pow((x-2),2))+4)
                sch=0;
            else
                sch++;
        }
        if (x>=5 & x<=6 & y<=sqrt(36-pow(x,2)) & y>=0)
            sch++;
        if (sch>=1) {
            System.out.println("Точка попала в область");
        } else {
            System.out.println("Точка не попала в область");
        }
    }
}