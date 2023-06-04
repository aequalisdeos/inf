import java.util.Scanner;
import static java.lang.Math.*;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v, u, vsr1, vsr2, otn;
        System.out.println("Введите скорость самолёта в безветренную погоду");
        v = in.nextDouble();
        System.out.println("Введите скорость ветра");
        u = in.nextDouble();
        vsr1 = (pow(v, 2) - pow(u, 2))/v;
        System.out.println("Средняя скорость самолёта, когда ветер дует вдоль линии AB - " + vsr1);
        vsr2 = (sqrt(pow(v, 2) - pow(u, 2)));
        System.out.println("Средняя скорость самолёта, когда ветер дует перпендикулярно линии AB - " + vsr2);
        otn = (sqrt(pow(v, 2) - pow(u, 2)))/v;
        System.out.println("Отношение средних скоростей всего перелёта для двух случаев - " + otn);
    }
}
