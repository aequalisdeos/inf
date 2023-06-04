import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class z3 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\Мишка\\Desktop\\z3.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file,true);
        Pattern pattern = Pattern.compile("[a-z]+");
        String [] line = fread.readLine().split("\\s+");
        fwrite.write("\n\nВЫВОД\n");
        for (int i=0;i<line.length;i++){
            Matcher mat = pattern.matcher(line[i]);
            if (mat.find()){
                fwrite.write(line[i]+"\s");
            }
        }
        fwrite.close();
    }
}
