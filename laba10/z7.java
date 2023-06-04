import java.io.*;
import java.text.DecimalFormat;
public class z7 {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Мишка\\Desktop\\z7.txt");
        FileWriter fwrite = new FileWriter(file);
        DecimalFormat decimalFormat =new DecimalFormat("#.#");
        fwrite.write("Постановка задачи\n" +
                "если (x < -2): y = EXP + PI * x\n" +
                "если (x > -2 & x < 2): y = cos(sin(x))\n" +
                "если (x > 2): y = EXP^cos(sin(cos(x)))\n" +
                " иначе: y= EXP\n");
        fwrite.write("Вывод от -4 до 4\t");
        for (double x = -4;x<=4;x+=1){
            if (x < -2) fwrite.write("f("+x+") = "+decimalFormat.format(Q(x))+"\t");
            if (x > -2 & x < 2) fwrite.write("f("+x+") = "+decimalFormat.format(R(x))+"\t");
            if (x > 2) fwrite.write("f("+x+") = "+decimalFormat.format(T(x))+"\t");
            else fwrite.write("f("+x+") = "+decimalFormat.format(Math.E)+"\t");
        }
        fwrite.close();
    }
    public static double Q(double x) {
        double a1;
        a1 = Math.E + Math.PI * x;
        return a1;
    }
    public static double R(double x) {
        double a2;
        a2 = Math.cos(Math.sin(x));
        return a2;
    }
    public static double T(double x) {
        double a3;
        a3 = Math.pow(Math.E, Math.cos(Math.sin(Math.cos(x))));
        return a3;
    }
}
