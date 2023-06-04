import static java.lang.Math.*;
import java.io.*;
import java.util.Scanner;
public class z10 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double x, er, xz, reazlt, output, sum=0;
        int step;
        long fac;
        File file= new File("C:\\Users\\Мишка\\Desktop\\z10.txt");
        FileOutputStream file_Out_Str = new FileOutputStream(file);
        OutputStreamWriter fWr = new OutputStreamWriter(file_Out_Str);
        BufferedWriter file_BW = new BufferedWriter(fWr);
        System.out.print("Введите x: ");
        x=scan.nextDouble();
        while (x>=1){
            System.out.print("x не должен быть больше или равен 1, повторите ввод: ");
            x=scan.nextDouble();
        }
        System.out.print("Введите отрицательную степень погрешности (от -2 до -4): ");
        step=scan.nextInt();
        while (step<-4 || step>-2){
            System.out.print("Вы ввели неправильную степень, повторите ввод: ");
            step=scan.nextInt();
        }
        er=pow(10,step);
        xz=pow(sin(x),3);
        for (int i=1; i<=99;i++) {
            fac = 2 * i;
            for (long j = (fac - 1); j > 1; j--) {
                fac = fac * j;
            }
            reazlt=pow(-1,i+1)*((pow(2,2*i-1)*pow(x,2*i))/fac);
            sum=sum+reazlt;
            if (abs(xz-sum)<er){
                output=xz-sum;
                file_BW.write("Функция f(x)=sin^3(x) для х="+x+" равняется "+xz);
                file_BW.write("\nРезультаты определения значений функции f(x)= pow(-1,i+1)*((pow(2,2*i-1)*pow(x,2*i))/fac) с помощью ряда Маклорена");
                file_BW.write("\nПогрешность итерационной процедуры "+er);
                file_BW.write("\nЗначение функции по Маклорену\t\t Погрешность, %\t\t Число итераций");
                file_BW.write("\n\t"+sum+"\t\t"+output+"\t\t"+i);
                break;
            }
        }
        file_BW.close();
    }
}