import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
public class z1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scan.nextInt();
        int doe_ch [] = new int[n];
        ArrayList< int[] > Chislo10 = new ArrayList< int[] >();
        int sch = 0;
        System.out.println("Введите число в троичной системе счисления по одной цифре");
        for (int i = 0; i<n; i++) {
            doe_ch[i] = scan.nextInt();
            while (i==0 & (doe_ch[i]==0 || doe_ch[i]>2 || doe_ch[i]<0)) {
                if (i==0 & doe_ch[i]==0)
                    while (i==0 & doe_ch[i]==0) {
                        System.out.println("Начало числа не может быть 0");
                        doe_ch[i] = scan.nextInt();
                    }
                if (i==0 & (doe_ch[i] > 2 || doe_ch[i] < 0))
                    while (i==0 & (doe_ch[i]>2 || doe_ch[i]<0)) {
                        System.out.println("Число может начинаться только с 1 и 2");
                        doe_ch[i] = scan.nextInt();
                    }
            }
            if (i>0 & (doe_ch[i]>2 || doe_ch[i] <0))
                while (i>0 & (doe_ch[i]>2 || doe_ch[i]<0)) {
                    System.out.println("Числа могут быть только 0, 1 и 2");
                    doe_ch[i] = scan.nextInt();
                }
        }
        int TempChislo10 = 0;
        for (int i = n-1, j=0; i>=0; i--, j++) {
            TempChislo10 += (int) (doe_ch[i] * pow(3, j)); }
        while (TempChislo10 > 0) {
            Chislo10.add(new int[1]);
            Chislo10.get(sch)[0] = TempChislo10 % 10;
            TempChislo10 /= 10;
            sch++; }
        int Desyt_ch[] = new int [sch];
        for (int i = sch-1, j=0; i>=0; i--, j++) {
            Desyt_ch[j] = Chislo10.get(i)[0]; }
        System.out.print("Число в 3 системе\n\t0,");
        for (int i=0; i<n; i++)
            System.out.print(doe_ch[i]);
        System.out.print("\nЧисло в 10 системе\n\t0,");
        for(int i=0; i<sch; i++)
            System.out.print(Desyt_ch[i]);
    }
}