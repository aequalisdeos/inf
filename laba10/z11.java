import java.io.*;
import java.text.DecimalFormat;
import static java.lang.Math.*;
public class z11 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Мишка\\Desktop\\z11.txt");
        BufferedWriter fwrite = new BufferedWriter(new FileWriter(file));
        fwrite.write("Функция z = cos(sin(x)+y)\n" +
                "(x >= 0 && x <= 6 && x += 0.1) && (y >= 0 && y <= 5 && y += 0.2)\n\nВывод\n");
        DecimalFormat dec = new DecimalFormat("####.#");
        DecimalFormat dec1 = new DecimalFormat("#.#");
        for (double x = 0;x<=6;x+=0.1){
            fwrite.write(dec1.format(x)+"\t");
            for (double y = 0;y<=5;y+=0.2){
                double z = cos(sin(x)+y);
                fwrite.write(dec.format(z)+"\t");
            }
            fwrite.write("\n");
        }
        fwrite.write("\n\nX/Y\t");
        for (double y = 0;y<=5;y+=0.2){
            fwrite.write(dec1.format(y)+"\t");
        }
        fwrite.close();
    }
}
