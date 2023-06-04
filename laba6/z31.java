import static java.lang.Math.*;
public class z31 {
    public static void main(String[] args) {
        double S=0, Sj=0;
        int j;
        for (int i=1; i<=8; i++) {
            j=1;
            while (j <= i) {
                Sj += pow((j + i), 2);
                j++;
            }
            S += Sj;
            Sj = 0;
        }
        System.out.println("Сумма сумм равна " + S);
    }
}
