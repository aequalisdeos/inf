import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class z2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Мишка\\Desktop\\z2.txt");
        FileWriter fwrite = new FileWriter(file);
        fwrite.write("\t\t\t\t\t\t\tТаблица умножения\n");
        int s=0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                s = i * j;
                fwrite.write(i + " * " + j + " = " + s + "\t");
            }
            fwrite.write("\n");
        }
        fwrite.close();
    }
}