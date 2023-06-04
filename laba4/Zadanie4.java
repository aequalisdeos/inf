import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m1, m2, u1, d1, u2, d2, summ, raz;
        System.out.println("ВВедите свой вес");
        m1 = in.nextDouble();
        System.out.println("Введите вес вашего кота");
        m2 = in.nextDouble();
        u1 = m1 * 0.035274;
        u2 = m2 * 0.035274;
        d1 = m1 * 0.564382;
        d2 = m2 * 0.564382;
        summ = u1 + u2;
        raz = d1 - d2;
        System.out.println("Ваш вес в унциях и драхма - " + u1 + " и " +d1);
        System.out.println("Вес вашего кота в унциях и драхма - " + u2 + " и " +d2);
        System.out.println("Суммарный вес в унциях - " + summ);
        System.out.println("Разница вашего веса и веса вашего кота в драхма - " + raz);
    }
}
